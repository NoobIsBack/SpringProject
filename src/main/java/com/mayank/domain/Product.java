//package com.mayank.domain;
//
//import com.datastax.oss.driver.api.core.type.DataType;
//import org.springframework.data.cassandra.core.mapping.CassandraType;
//import org.springframework.data.cassandra.core.mapping.PrimaryKey;
//import org.springframework.data.cassandra.core.mapping.Table;
//
//import java.io.Serializable;
//import java.math.BigDecimal;
//import java.util.UUID;
//
//@Table("products")
//public class Product implements Serializable {
//    @PrimaryKey
////    @CassandraType()
//    private UUID id;
//    private String description;
//    private BigDecimal price;
//    private String imageUrl;
//
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//}
