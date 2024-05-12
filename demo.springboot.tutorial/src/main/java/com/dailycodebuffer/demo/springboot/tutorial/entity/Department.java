package com.dailycodebuffer.demo.springboot.tutorial.entity;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Department {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;
    @NotBlank(message = "Please entire the Department Name")
    private String departmentName;
    private String departmentCode;
    private String departmentAddress;
    private String departmentEmail;

}
