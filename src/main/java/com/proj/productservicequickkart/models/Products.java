package com.proj.productservicequickkart.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products extends BaseModel {
    /*This class will be having private attributes so that the control can be maintained.
    The getters and setters can be created by the use of LOMBOK library that we had
    selected while setting up the environment.
    If somehow we don't want to create the setter or getter of any attribute, we
    have to create getter and setter manually as usual*/
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
}
