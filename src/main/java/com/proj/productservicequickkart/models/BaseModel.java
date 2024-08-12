package com.proj.productservicequickkart.models;

import java.util.Date;

public class BaseModel {
    /*This class is created for handling all the common attributes to other classes
     to reduce the duplicacy, the other classes can extend this class and
     inherit the attributes */
    private int id;
    private String name;
    private Date created_on;
}