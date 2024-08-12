package com.proj.productservicequickkart.services;

import com.proj.productservicequickkart.models.Products;

import java.util.List;

/*
* Why did we create an interface between the controller and the services (FakeStoreProductService or SelfDBProductService)?

Because if we are using FakeStoreProductService today, we might need to switch to other service tomorrow. To make sure it happens without any hassle and with minimal changes, we take the help of interface. In the controller, we'll be injecting the dependency of the interface, then Spring will check what all are the classes that are implementing this interface. It will find FakeStoreDB and SelfDB services both, and will give error that a single implementation is not found. Then, we'll have to make any of the services as @Primary so that whatever is primary, the control can go to that service and further functionalities may happen. If there is only a single service, in that case there's no issue because it will be called everytime. There is a catch here, the service should be mentioned as a special class as @Service. Only then the Spring would make the object of that service.
* */

public interface ProductServiceInterface {
    Products getSingleProduct(Long id);
    List<Products> getAllProducts();
}
