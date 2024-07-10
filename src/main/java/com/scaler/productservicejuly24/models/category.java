package com.scaler.productservicejuly24.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class category  extends BaseModel{
    private String title;
    private double price;
    private String descreption;





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
}
