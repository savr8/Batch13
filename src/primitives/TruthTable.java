package primitives;

public class TruthTable {
    public static void main(String[] args) {
//===============&===================
        boolean visa = true;
        boolean ticket =true;
        boolean travel1 = visa && ticket;
        System.out.println("Can travel?"+travel1);//true

        boolean passport = false;
        boolean travel2 =  visa&& ticket&& passport;
        System.out.println("Can travel with no passport?"+ travel2);//false

        passport = true;
        boolean travel3 = visa&& ticket&& passport;
        System.out.println("Can travel with NEW passport?"+ travel3);//true

        boolean travel4 =  visa&& ticket&& !passport;
        System.out.println("Can you travel if you lost the passport?"+travel4);//false
        //=====||=============
        boolean cash = true;
        boolean creditLimit = false;
        boolean canBuy = cash || creditLimit;
        System.out.println("Can you buy ?"+ canBuy);//true
        System.out.println("can you buy?"+(!cash || creditLimit));//false







    }
}
