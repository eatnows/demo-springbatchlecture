package io.springbatch.springbatchlecture.batch.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {

    @Id
    private Long id;
    private String name;
    private int price;
    private String type;
}
