package com.mayank.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(
        basePackages= "com.mayank.repository"
)
public class CassandraConfig extends AbstractCassandraConfiguration {

//    @Override
//    protected String getKeyspaceName() {
//        return "testKeySpace";
//    }
//
//    @Bean
//    public CassandraClusterFactoryBean cluster() {
//
//    }
//
//    @Bean
//    public CassandraMappingContext cassandraMappingContext()
//    throws ClassNotFoundException {
//        return new BasicCassandraMappingContext();
//    }


    @Value("${cassandra.contactpoints}")
    private String contactPoints;

    @Value("${cassandra.port}")
    private int port;

    @Value("${cassandra.keyspace}")
    private String keySpace;

    @Value("{cassandra.basePackages}")
    private String basePackages;


    protected String getKeyspaceName() {
        return keySpace;
    }


    protected String getContactPoints() {
        return contactPoints;
    }

    protected int getPort() {
        return port;
    }


    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[] {basePackages};
    }




}
