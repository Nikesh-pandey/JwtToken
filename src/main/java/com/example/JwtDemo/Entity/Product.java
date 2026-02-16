package com.example.JwtDemo.Entity;
import com.example.JwtDemo.Enum.ProductType;
import jakarta.persistence.*;

@Entity
@Table(name = "Product_Table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    @Column
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private int price;
    @Enumerated(EnumType.STRING)
    private ProductType productType;
    @Column(nullable = false)
    private int quantity;

    public Product(){};

    public Product(String image,String name, String description, int price, ProductType productType, int quantity) {
        this.image=image;
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

    public void setId(Long id) {
        this.id = id;
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
