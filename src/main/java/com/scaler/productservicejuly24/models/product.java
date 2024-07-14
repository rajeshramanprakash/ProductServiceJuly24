package com.scaler.productservicejuly24.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class product extends BaseModel {
    private String title;
    private double price;
    private category category;

}
