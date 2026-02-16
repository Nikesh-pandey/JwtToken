package com.example.JwtDemo.DTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import com.example.JwtDemo.Entity.Product;
import com.example.JwtDemo.Enum.ProductType;

public class ProductRequestDto {
    public String image;

    @NotNull(message = "Add name")
    private String name;
    private String description;
    private int price;
    private ProductType productType;
    private int quantity;

    public ProductRequestDto(){};


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

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
