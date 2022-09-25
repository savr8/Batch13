package object;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;

public class Employee {
    String id;
    String department;
    String city;
    int age;

    public Employee(String department, String city, int age) {
        Random random = new Random();
        this.id = "" + random.nextInt(1000);
        // LocalDateTime.now();
        this.department = department;
        this.city = city;
        this.age = age;
    }

    public void departmentChaecker() {
        if (department.equalsIgnoreCase("IT")) {
            System.out.println("Are you SDET?");
        }
    }
    //overloading departmentChecker method to use with multiple employee

    public static void departmentChaecker(Employee[] data) {
       for(Employee employee:data){
        if (employee.department.equalsIgnoreCase("IT")) {
            System.out.println("Are you SDET?");
        }}


}}
