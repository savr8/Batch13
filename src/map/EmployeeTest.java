package map;

import java.util.*;
import java.util.HashMap;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("David", "Chicago", 21, 1);
        Employee e2 = new Employee("Alex", "NY", 31, 2);
        Employee e3 = new Employee("Sam", "Miami", 20, 3);
        Employee e4 = new Employee("Gela", "LA", 51, 5);
        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(e1.id, e1);
        map.put(e2.id, e2);
        map.put(e3.id, e3);
        map.put(e4.id, e4);
        System.out.println(map);
        System.out.println(map.get(e1.id));//e1 -->Employee object
        printNames(map);
        EmployeeTest et =new EmployeeTest();
        et.youngerPopulation(map);
    }

    public static void printNames(HashMap<Integer, Employee> employeeHashMap) {

        for (Employee employee : employeeHashMap.values()) {
            System.out.println(employee.name);
        }
    }

    // create method that will print out city of employee who has age of 21 or less
    public static void youngerPopulation(HashMap<Integer, Employee> employeeMap) {
        Collection<Employee> employees = employeeMap.values();
        for (Employee employee : employees) {
            if (employee.age <= 21) {
                System.out.println("Employees who is 21 and younger are living in  " + employee.city);
            }
        }
    }
}


