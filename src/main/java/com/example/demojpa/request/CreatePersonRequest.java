package com.example.demojpa.request;

import com.example.demojpa.models.Person;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreatePersonRequest {
    @NotBlank(message = "First name should not empty")
    private String firstname;//SHOULD NOT BE EMPTY
    private String lastname;//CAN BE EMPTY
    @NotBlank(message = "dob should not be empty")
    private String dob;//MANDATORY TO GIVE DATA OF BIRTH

    @NotBlank(message =  "location cannot be empty")
    private String location;//MANDATORY TO GIVE DATA OF BIRTH


    public Person to()
    {
        //returing the object of Person
        return Person.builder().firstname(firstname).lastName(lastname).dob(dob).build();
    }
}
