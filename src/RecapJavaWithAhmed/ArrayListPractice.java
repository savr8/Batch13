package RecapJavaWithAhmed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPractice {




    /*
    POSSIBLE INTERVIEW QUESTION:

    1-What is the difference between Array and ArrayList?

      Arrays:                                   ArrayList
    1-Fixed Size                               1-Dynamic Size or Flexible
    2-Multidimensional Form                    2-Doesn't have this form
    3-Stores Primitives and Objects            3-Only Stores Objects
    4-doesn't have methods for manipulation    4-Has methods(add,remove,get,replace)
    5-Syntax is different                      5-Syntax is different
      int[] number=new int[3];                 List<Integer> number=new ArrayList();
      int[] number={1,2,3};                   ArrayList<Integer> number=new ArrayList();
    indexing-> number[0]                        indexing->number.get(0)
      NOTE: COMMON POINT OF ARRAY AND ARRAYLIST
        *****THEY BOTH ARE INDEXING

    2-What is the difference between Arraylist and LinkList?

      I do not use LinkList in my project often but the efficiency of reaching out
      the element in Arraylist "FASTER" than LinkedList.
      **IN SUMMARY:the efficiency of ARRAYLIST is better to reach out element
        **WHEN manipulation happens the efficiency of LINKEDLIST IS BETTER>
      IN ADDITION TO THIS:LinkedList has extra methods(not from me)

        NOTE:If you need more information you can go to youtube and watch the video.
     */

        public static void main(String[] args) {

            int [] numbers=new int[3];
            //  numbers.
            Object[] number1={"1",true,1,1.5,"ahmet"};
            List<Integer> number=new ArrayList<>();
            LinkedList<Integer> numberLink=new LinkedList<>();
            numberLink.add(1);
            numberLink.add(2);

            System.out.println(numberLink.getFirst());
            System.out.println(numberLink.getLast());
            number.add(1);
            number.get(0);
            number.remove(0);

        }
    }

