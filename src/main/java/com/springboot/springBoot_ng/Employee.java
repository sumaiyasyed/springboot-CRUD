package com.springboot.springBoot_ng;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private int id;

    private String name;

    private String email;

    private String dob;

    @Transient
    private int age;


}
