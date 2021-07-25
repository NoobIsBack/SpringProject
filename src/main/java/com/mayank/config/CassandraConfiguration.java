//package com.mayank.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
//import org.springframework.data.cassandra.config.SchemaAction;
//import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
//import org.springframework.data.cassandra.core.cql.keyspace.DropKeyspaceSpecification;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Configuration
//public class CassandraConfiguration extends AbstractCassandraConfiguration {
//
//    private static final String KEYSPACE = "mayank_keyspace";
//
//    @Override
//    public SchemaAction getSchemaAction() {
//        return SchemaAction.CREATE_IF_NOT_EXISTS;
//    }
//
//    @Override
//    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
//        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);
//
//        return Arrays.asList(specification);
//    }
//
//    @Override
//    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
//        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
//    }
//
//    @Override
//    protected String getKeyspaceName() {
//        return KEYSPACE;
//    }
//
//    @Override
//    public String[] getEntityBasePackages() {
//        return new String[]{"com.mayank.domain"};
//    }
//
//}
