package com.example.lab

import java.time.LocalDate

data class Employee(
    val fullName: String,
    val dateOfEmployment: LocalDate,
    val division: Int,
    val category: String,
    val position: String,
    val salary: Int,
    val partTime: Boolean
) : Comparable<Employee> {
    override fun compareTo(employee: Employee): Int {
        val compare = fullName.compareTo(employee.fullName)
        return if (compare != 0) compare else dateOfEmployment.compareTo(employee.dateOfEmployment) + category.compareTo(employee.category)
    }
}