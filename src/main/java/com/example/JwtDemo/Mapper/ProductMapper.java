package com.example.JwtDemo.Mapper;
import com.example.JwtDemo.DTO.ProductRequestDto;
import com.example.JwtDemo.DTO.ProductResponseDto;
import com.example.JwtDemo.Entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    //map to Entity
    public Product mapToProduct(ProductRequestDto productRequestDto, String imageName){
        return new Product(
                imageName,
                productRequestDto.getName(),
                productRequestDto.getDescription(),
                productRequestDto.getPrice(),
                productRequestDto.getProductType(),
                productRequestDto.getQuantity()
        );
    }
    public ProductResponseDto mapToDto(Product product){
    return new ProductResponseDto(
            product.getId(),
            product.getImage(),
            product.getName(),
            product.getDescription(),
            product.getPrice(),
            product.getProductType(),
            product.getQuantity()
    );
    }


}
