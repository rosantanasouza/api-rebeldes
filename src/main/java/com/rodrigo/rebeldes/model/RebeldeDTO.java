package com.rodrigo.rebeldes.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class RebeldeDTO {

    private Integer id;
    private String name;
    private Integer age;
    private String genre;
    private LocationDTO currentLocationDTO;
    private List<String> inventory = new ArrayList<>();
}
