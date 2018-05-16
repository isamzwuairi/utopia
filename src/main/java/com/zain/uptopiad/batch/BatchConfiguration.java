package com.zain.uptopiad.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.MongoItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.zain.uptopiad.models.Pam;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	  private MongoTemplate mongoTemplate;

	// start::readerwriterprocessor[]
	@Bean
	public PamItemReader reader() {
		return new PamItemReader();
	}

	@Bean
	public PamItemProcessor processor() {
		return new PamItemProcessor();
	}

	// @Bean
	// public JdbcBatchItemWriter<Person> writer(DataSource dataSource) {
	// return new JdbcBatchItemWriterBuilder<Person>()
	// .itemSqlParameterSourceProvider(new
	// BeanPropertyItemSqlParameterSourceProvider<>())
	// .sql("INSERT INTO people (first_name, last_name) VALUES (:firstName,
	// :lastName)")
	// .dataSource(dataSource)
	// .build();
	// }
	@Bean
	public ItemWriter<Pam> writer() {
		MongoItemWriter<Pam> writer = new MongoItemWriter<Pam>();
		writer.setTemplate(mongoTemplate);
		writer.setCollection("pam2");
		return writer;
	}
	// end::readerwriterprocessor[]

	// tag::jobstep[]
    @Bean
    public Job importUserJob(JobBuilderFactory jobs, Step s1, JobExecutionListener listener) {
        return jobs.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(s1)
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Pam, Pam> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
	// end::jobstep[]
}
