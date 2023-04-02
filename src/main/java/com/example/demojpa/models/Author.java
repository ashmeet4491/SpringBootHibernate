package com.example.demojpa.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
@Entity//Entity is getting used here so that any orm mapper
@Table(name = "Author")
public class Author {

    @Id
    private Integer id;

    private String name;
}
