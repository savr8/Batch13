package Switch;

public class SwitchStatement {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {

            case 2:
                System.out.println("This is IT department");
                break;
            case 1:
                System.out.println("This is HR department");
                break;
            case 3:
                System.out.println("This is Admin");

                break;
            case 5:
                System.out.println("This is Help desk");
                break;
            default:
                System.out.println("No matching entry");
        }
    }
}
