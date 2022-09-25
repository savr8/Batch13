package Loops;

public class NestedForLoopClock {
    public static void main(String[] args) {

        /*
        print minutes and hours from 1 to 11
        1:0:0
        1:1:1
        1:59:2
        2:0
        1:1
        ..
        ...
        11:58
        11:59

         */
        FIRST:
        for (int hour = 1; hour <= 11; hour++) {
            SECOND:

            for (int minute = 0; minute < 60; minute++) {

                if (minute == 25) {
                    break FIRST;
                }
                THIRD:
                for (int sec = 0; sec <= 59; sec++) {
                    System.out.println(hour + ":" + minute + ":" + sec);

                }

            }
        }


    }
}
