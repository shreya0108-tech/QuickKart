package com.proj.productservicequickkart.controllers;

import com.proj.productservicequickkart.ProductServiceQuickKartApplication;
import com.proj.productservicequickkart.models.Products;
import com.proj.productservicequickkart.services.ProductServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")        //address to the controller
public class ProductController {
    /*To make the object of ProductController, Spring needs to create the
    * object of ProductServiceInterface because it is dependent on it.
    * But, an interface cannot be instantiated, thus Spring will create the
    * object of the class which is implementing the interface and store it in the
    * application context, also called as IOC. That service
    * should be marked as a special class @Service, for Spring to consider it
    * for creating an object, once the object of that service is created, the
    * object for the controller can also be made as the dependency is resolved.*/

    ProductServiceInterface productServiceInterface;
    //depending upon interface and not service.
    ProductController(ProductServiceInterface ps)
    {
        this.productServiceInterface = ps;
    }

    @GetMapping("/{id}")
    Products getProductById(@PathVariable("id") Long id)
    {
        return productServiceInterface.getSingleProduct(id);
    }
    @GetMapping
    List<Products> getAllProducts()
    {
        return new ArrayList<>();
    }
}
