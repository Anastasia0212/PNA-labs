package com.example.lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

@SpringBootApplication
class Lab

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val enterpriseContainer = context.getBean(Container::class.java) as EnterpriseContainer

    val glEmployees = listOf<Employee>(
        Employee("Mikhail Feshchenko", LocalDate.of(2015, 10, 10), 3, "Fullstack", "Senior Developer", 5200, false),
        Employee("Evgen Serchenko", LocalDate.of(2023, 2, 20), 1, "FrontEnd", "Junior Developer", 500, true),
        Employee("Serhii Timoshenko", LocalDate.of(2022, 12, 1), 1, "BackEnd", "Junior Developer", 550, false),
    )

    val googleEmployees = listOf<Employee>(
        Employee("Serhii Brinn", LocalDate.of(1998, 9, 4), 5, "co-founder", "Director", 180000, false),
        Employee("Lawrence Edward «Larry» Page", LocalDate.of(1998, 9, 4), 5, "founder", "CEO", 200000, false),
        Employee("Mike Ferguson", LocalDate.of(2020, 10, 1), 2, "QA", "Middle QA", 4000, false),
        Employee("Jackson Jr. Val", LocalDate.of(2022, 2, 20), 1, "FrontEnd", "Junior Developer", 2000, false),
    )

    enterpriseContainer.add(
        Enterprise(
            "GlobalLogic Ukraine",
            "Low-level controllers development",
            "Ukraine",
            4,
            LocalDate.of(2005, 1, 10),
            1500,
            true,
            glEmployees
        ),
    )

    enterpriseContainer.add(
        Enterprise(
            "Google",
            "Software",
            "USA",
            50,
            LocalDate.of(1998, 9, 4),
            140000,
            true,
            googleEmployees
        ),
    )
}
