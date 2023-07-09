package com.geekster.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String firstName;
    private String lastName;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    Address address;
}
