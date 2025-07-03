package com.graphql.entity;

import com.arangodb.springframework.annotation.Document;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
@Document("demotable")
public class Book {

    @Id
    private String id;

    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}






//--------------------for h2-----------------



//package com.graphql.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.ToString;
//
//@Entity
//@Data
//@ToString
//@Table(name="booktable")
//public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String title;
//    private String desc;
//    private String author;
//    private double price;
//    private int pages;
//}
