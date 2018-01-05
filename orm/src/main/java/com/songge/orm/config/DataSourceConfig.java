package com.songge.orm.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	@Bean(name="songe")
	@ConfigurationProperties(prefix = "spring.datasource.songge")
	public DataSource dataSource_songge() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="lhgene")
	@ConfigurationProperties(prefix = "spring.datasource.lhgene")
	public DataSource dataSource_lhgene() {
		return DataSourceBuilder.create().build();
	}
}
