// With the help of this file we can create table in arangodb at runtime.

// this is totally right i am commenting because of I have another one class ArangoInit.java
// wich have two properties table and db both.


//
//package com.graphql;
//
//import com.arangodb.ArangoDatabase;
//import com.arangodb.springframework.core.ArangoOperations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class CollectionInitializer {
//
//    @Autowired
//    private ArangoOperations arangoOperations;
//
//    private final String collectionName = "bookteable34";
//
//    @PostConstruct
//    public void createCollectionIfNotExists() {
//        // Use the configured database name explicitly
//        ArangoDatabase db = arangoOperations.driver().db("bookdb");
//
//        System.out.println(" Using database: " + db.name());
//
//        if (!db.collection(collectionName).exists()) {
//            db.createCollection(collectionName);
//            System.out.println("Created collection: " + collectionName);
//        } else {
//            System.out.println("Collection already exists: " + collectionName);
//        }
//    }
//}
