package Loops;

public class ForLoop5 {
    public static void main(String[] args) {
        //print for loop out upper casealphabet by separating each letter wih '-'
        //outcome "A-B-C...Z"
        //print Q without dash
        //print upper case L with stars *L*
        for (char ch ='A';ch <='Z'; ch++){



            if (ch!='Z' && ch!='Q'&&ch !='W'&&ch!='L'){
                System.out.print(ch +"-");

            } else if (ch=='W') {
                System.out.println('w'+"-");
            } else if(ch=='L'){
                System.out.println("*"+ch+"*");
            }
            else{
                System.out.println(ch);
            }
        }
    }
}
