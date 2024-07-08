package com.mas.manageIT.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class Person {

    private Long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    @Email
    private String email;

    @Size(min = 9, max = 9)
    private Integer phoneNumber;

    private String correspondenceAddress;

    private Boolean isArmyMember;

    private String maidenName;

    private Boolean isPregnant;

    public abstract String getType();

}
