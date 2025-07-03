// 1. Create database (if not exists)
// 2. Create collection (if not exists)
package com.graphql;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDatabase;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class ArangoInit {

    private final String DB_NAME = "DemoDB";
    private final String COLLECTION_NAME = "demotable";

    @PostConstruct
    public void init() {
        ArangoDB arangoDB = new ArangoDB.Builder()
                .host("localhost", 8529)
                .user("root")
                .password("") // if password is set, fill here
                .build();

        // 1. Create DB if not exists
        if (!arangoDB.db(DB_NAME).exists()) {
            arangoDB.createDatabase(DB_NAME);
            System.out.println("Created database: " + DB_NAME);
        } else {
            System.out.println("Database already exists: " + DB_NAME);
        }

        // 2. Create collection if not exists
        ArangoDatabase db = arangoDB.db(DB_NAME);
        if (!db.collection(COLLECTION_NAME).exists()) {
            db.createCollection(COLLECTION_NAME);
            System.out.println("Created collection: " + COLLECTION_NAME);
        } else {
            System.out.println("Collection already exists: " + COLLECTION_NAME);
        }
    }
}
