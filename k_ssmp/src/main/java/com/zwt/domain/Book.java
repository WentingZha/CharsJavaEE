package com.zwt.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//Lombok
//@Getter
//@Setter
@Component
@Data
public class Book {
    Integer id;
    String name;
    String description;
    String type;

}
