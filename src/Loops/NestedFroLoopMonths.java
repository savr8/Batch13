package Loops;

public class NestedFroLoopMonths {
    public static void main(String[] args) {
        /*
        print all months for the years between 2020 and2023
        output 2020-1,2020-2-january
               2021 -1,2021-2-january
         */
        for (int year=2020;year<2023;year++){
            System.out.print(year);
            for(int months=1;months<=12;months++){
                System.out.print("-"+months+",");
                switch (months){
                    case 1:
                        System.out.print("january");
                        break;
                        case 2:
                        System.out.print("febryary");
                        break;
                    case 3:
                        System.out.print("march");
                        break;
                    case 4:
                        System.out.print("april");
                        break;

                }
            }
            System.out.println();
        }
    }
}
