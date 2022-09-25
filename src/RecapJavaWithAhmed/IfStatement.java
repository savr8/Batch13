package RecapJavaWithAhmed;

public class IfStatement {
    /*
    POSSIBLE INTERVIEW QUESTIONS

    1-Many Technical questions have if statement conditions for the solution

    There are 2 conditions for if statements :True-False
    AND==>TRUE && TRUE-->TRUE        OR==>TRUE || TRUE -->TRUE
          TRUE && FALSE -->FALSE          TRUE ||FALSE-->TRUE
          FALSE && FALSE-->FALSE          FALSE ||FALSE-->FALSE


    SUMMARY: I would say that For "AND" condition the only way you make the 2 conditions
    or more situations true -->both of them must be TRUE
    SUMMARY 2 :I would say that For "OR" condition the only way you make the 2 conditions
    or more situations false -->both of them must be FALSE
     */

    public static void main(String[] args) {
        int cat = 20;
        int dog = 10;
        int rabbit = 5;
           //true   fasle   false    false  false
        if (cat > dog && rabbit > dog || cat < rabbit) {//false
            System.out.println("this condition is TRUE");
        } else if (cat > dog && dog > rabbit && cat > rabbit) {
            System.out.println("This condition is 2 part TRUE");
        } else {
            System.out.println("This condition is FALSE");
        }

        //TERNARY OPERATORS:                                                                      FALSE
        String ternaryOperator = cat >dog && rabbit>dog || cat<rabbit?"This condition is TRUE":"This condition is FALSE";
        System.out.println(ternaryOperator);
        //NOTE:Ternary operators are really useful for automation and testing purposes since it is more efficent
        //--less amount of code
        //--clear to understand



    }

}
