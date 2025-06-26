package com.nk.binding;

import lombok.Data;
import jakarta.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Book {

    private Integer id;
    private String name;
    private Double price;

}
