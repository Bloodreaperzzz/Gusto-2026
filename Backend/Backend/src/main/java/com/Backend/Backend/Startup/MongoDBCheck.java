package com.Backend.Backend.Startup;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class MongoDBCheck implements StartupCheck{
    private final MongoTemplate mongoTemplate;
    public MongoDBCheck(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    @Override
    public void run() throws Exception {
        String dbName = mongoTemplate.getDb().getName();
        System.out.println("✅ MongoDB connected: " + dbName);
    }

}
