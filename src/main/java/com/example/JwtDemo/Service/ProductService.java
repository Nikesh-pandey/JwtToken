package com.example.JwtDemo.Service;
import com.example.JwtDemo.DTO.ProductResponseDto;
import com.example.JwtDemo.DTO.ProductRequestDto;
import com.example.JwtDemo.Entity.Product;
import com.example.JwtDemo.Repository.ProductRepository;
import com.example.JwtDemo.Mapper.ProductMapper;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ProductService {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;
    public ProductService(ProductMapper productMapper,ProductRepository productRepository){
        this.productMapper=productMapper;
        this.productRepository=productRepository;
    }
final private String fileName="src/main/resources/static";
        public ProductResponseDto addItems (ProductRequestDto productRequestDto, MultipartFile image)throws Exception{
            String finalImageName = image.getOriginalFilename();
            String finalImageName2 = "";
            if(finalImageName != null && !finalImageName.isEmpty()){
                String uploadFile;
                File file= new File(fileName);
                if(!file.exists())file.mkdir();
            finalImageName2=fileName+finalImageName;
                Path path= Paths.get(finalImageName2);
                Files.write(path, fileName.getBytes());
            }
            Product product=productMapper.mapToProduct(productRequestDto,finalImageName2);
            productRepository.save(product);
ProductResponseDto responseObj= productMapper.mapToDto(product);
return responseObj;
    }
}
