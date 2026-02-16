package com.example.JwtDemo.Controller;


import com.example.JwtDemo.DTO.ProductRequestDto;
import com.example.JwtDemo.DTO.ProductResponseDto;
import com.example.JwtDemo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

@PostMapping("/ja")
    public ResponseEntity<?> addImage(@RequestPart("haha") ProductRequestDto productRequestDto, @RequestPart("image") MultipartFile image){
        try {
if(image==null){
    throw new Exception("laduuuuu");
}
            return new ResponseEntity<>(productService.addItems(productRequestDto, image), HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


}
