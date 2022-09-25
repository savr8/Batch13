package object;

public class TestEmloyee {
    public static void main(String[] args) {
        Employee e1 = new Employee("IT", "Chicago", 21);
        Employee e2 = new Employee("HR", "Chicago", 21);
        Employee e3 = new Employee("IT", "Chicago", 21);

        Flower flower1 = new Flower("Violet", "Medium", "Violet", 11);

        Flower flower2 = new Flower("Rose", "Medium", "Red", 14);
        Employee[] employees = {e1, e2, e3};
        int[] a = {2, 3};
        Object[] emplotee1 = {"world", 2, true, e1, e2, e3, flower1, flower2};
        e1.departmentChaecker();
        e2.departmentChaecker();
        System.out.println("================");

        Employee.departmentChaecker(employees);
        System.out.println("-----------------");

    }
}
