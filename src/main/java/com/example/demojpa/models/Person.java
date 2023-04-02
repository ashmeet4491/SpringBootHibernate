package com.example.demojpa.models;

import lombok.*;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
@Entity//Entity is getting used here so that any orm mapper
@Table(name = "my_person")
public class Person{
    private static int counter;
    @Id
    private Integer id ;
    @Column(name = "first_name" ,length = 30)
    private String firstname;
    private String lastName;
    private String dob;
    private Integer age;
    @Transient
    public String dummmy;

}
