package com.scaler.productservicejuly24.models;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.Date;
@Getter
@Setter

public class BaseModel {
    private Long  id;
    private Date CreatedAt;
    private Date UpdatedAt;
}
