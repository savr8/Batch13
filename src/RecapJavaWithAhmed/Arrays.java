package RecapJavaWithAhmed;

public class Arrays {
    /*

    POSSIBLE INTERVIEW QUESTIONS:

    1-What is the difference between Array and ArrayList?
    Arrays:is storage for multiple elements
    1*-Arrays has fixed size(you give the length for the Array at the beginning and it is not flexible)
    2*-Arrays cannot be manipulated(it doesn't have methods)
    3*-Arrays can state Primitives and Objects
    4*-Array has a length feature
    5*-Array has MULTIDIMENSIONAL from.***

INTERVIEW QUESTION TASK:
Write an implementation that declare int array and find the://1,2,3,8,12,65,76,5,22,17//7-10

1-Sum of the even number
2-Sum of the odd number
3-Difference between them(a-b or b-a)
OUTPUT -->120 SUM OF EVEN
OUTPUT -->91 SUM OF ODD
DIFFERENCE -->29(NOT MINUS -29)
NOTE:You can use google for the meaning of even and odd number

     */
    public static void main(String[] args) {


   int []allNumbers={1,2,3,8,12,65,76,5,22,17};
int sumOfEvenNumbers= 0;
int sumOfOddNumber=0;
int differenceOfThem=0;
//How can i access all of the numbers -->WITH LOOPS
//I use foreach loop once i iterate (all elements),i prefer using for each loop

   for(int number :allNumbers){
      if (number%2==0){
           sumOfEvenNumbers+=number;
      }
      else if (number%2 !=0){
          sumOfOddNumber+=number;
       }
   }
 //  if(sumOfEvenNumbers>sumOfOddNumber){
       differenceOfThem=sumOfEvenNumbers-sumOfOddNumber;

   //}else {differenceOfThem= sumOfOddNumber=sumOfEvenNumbers;
     //    }
differenceOfThem=sumOfEvenNumbers>sumOfOddNumber?sumOfEvenNumbers-sumOfOddNumber:sumOfOddNumber-sumOfEvenNumbers;
        System.out.println(sumOfEvenNumbers);
        System.out.println(sumOfOddNumber);
    }

}
