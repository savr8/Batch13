package RecapJavaWithAhmed;

public class StaticInstanceBlock {
    /*    POSSIBLE INTERVIEW QUESTIONS
    1- What is static as a keyword and why do you use it?

    Static(as a keyword) is a way to make your methods and variables accessible from
    other classes.IT MEANS YOU CAN ACCESS THESE METHODS AND VARIABLES WITHOUT CREATING AN OBJECT.***
    *The advantage of having static keyword is that you do not need to create an obgect
    *The disadvantage of having static keyword you cannot OVERRIDE the static methods
    *The disadvantage of having static keyword you cannot call non-static methods,variables inside of
    static methods.

    NOTE:I can definetly say static as a keyword is really useful for my project***

    2- What is static block and instance block?
    *these are type of block that called from system immediatly.It means you do not need to call it directly.
    -->static block-->it will RUN ONLY ONCE AND ALWAYS FIRST LINE(BANK OF AMERICA)
    -->instance block-->it will run as many as objects you have.

    3-What is static variable?
    -->It makes the variable belong to the class
    *It is shared(changeable for each object)-->common for each object
    * It can be accessed from other class without creating an object

     */
    static double money = 1000;

    public static void spendingMoney(double amountMoney) {
        money = money - amountMoney;
    }

    static {//this is static block
        System.out.println("BANK OF AMERICA");
        System.out.println("this is static block");
    }

    {//THIS IS CALLED INSTANCE BLOCK
        System.out.println("this is instance block");
    }

    public static void example() {
        System.out.println("ahmet");
        // spendingMoney(100);
    }

}
