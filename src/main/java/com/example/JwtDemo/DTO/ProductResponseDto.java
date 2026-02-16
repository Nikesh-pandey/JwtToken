package com.example.JwtDemo.DTO;

import com.example.JwtDemo.Enum.ProductType;

public class ProductResponseDto {
private Long id;
    public String image;
    private String name;
    private String description;
    private int price;
    private ProductType productType;
    private int quantity;



    public ProductResponseDto(Long id, String image, String name, String description, int price, ProductType productType, int quantity) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productType = productType;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }
}
