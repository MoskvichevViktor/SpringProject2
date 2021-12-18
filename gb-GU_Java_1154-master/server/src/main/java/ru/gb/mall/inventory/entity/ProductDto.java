package ru.gb.mall.inventory.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;


    private BigDecimal price;

    private String categoryTitle;

    public ProductDto(Product product) {
        this.id = product.getId();
    }
}
