package edu.miu.springaop.controller;

import edu.miu.springaop.aspect.annotation.ExecutionTime;
import edu.miu.springaop.aspect.annotation.LogMe;
import edu.miu.springaop.entity.Product;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @ExecutionTime
    @LogMe
    @GetMapping
    public List<Product> getAll() {


       // System.out.println("method name : getAll");
        System.out.println("method");
        return null;
    }

    public void test(){

    }

    @LogMe
    @PostMapping
    public void save() {
      //  System.out.println("method name : save");
    }

    @LogMe
    @DeleteMapping
    public void delete() {
       // System.out.println("method name : delete");
    }

}
