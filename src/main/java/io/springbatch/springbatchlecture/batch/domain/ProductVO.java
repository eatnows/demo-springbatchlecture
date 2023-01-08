package io.springbatch.springbatchlecture.batch.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ProductVO {
    private Long id;
    private String name;
    private int price;
    private String type;

    @Builder
    public ProductVO(Long id, String name, int price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
