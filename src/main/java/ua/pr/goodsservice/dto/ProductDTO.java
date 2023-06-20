package ua.pr.goodsservice.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private long price;
    private String categoryName;

}
