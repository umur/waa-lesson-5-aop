package edu.miu.springaop.controller;

import edu.miu.springaop.aspect.annotation.ExecutionTime;
import edu.miu.springaop.aspect.annotation.LogMe;
import edu.miu.springaop.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @ExecutionTime
    @LogMe
    @GetMapping
    public List<Product> getAll(){

        return null;
    }

}
