package RecapJavaWithAhmed;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetPractice {




    /*
    POSSIBLE INTERVIEW QUESTIONS

    1-How can you make the element unique with collection?(American Style)
    1.1-What is set?what is the purpose of using it ?(indian stle)
    1.2-In what condition do you use set in your project ? can you give an example?(Ahmet style)

     -->I can make the all elements(data) unique by using SET collection.

    2)Can you tell me the types of collections?

     -->SET
     -->LIST
     -->QUEUE(we didn't talk and not necessary)

    3-Can you explain the difference between SET AND LIST?

      LIST:                                 SET:
    1-can store duplicates                1-ONlY unique
    2-It has indexing (for,foreach)       2-It doesn't have indexing (for each loop)
    3-Synthax is different                3-Syntax is different
      -List list=new ArrayList()           -Set set=new HashSet();

    4-What is the difference between SET TYPES?
        -->HashSet-->it stores the element no order(randomly)
        -->LinkHashSet-->it stores the element insertion order(the way that you assign)
        -->TreeSet-->it stores the element ascending order.

        NOTE: If you want to get more information. GO to youtube.com or google.com.
     */

        public static void main(String[] args) {
            Set numbers= new TreeSet();
            numbers.add(1);
            numbers.add(6);
            numbers.add(4);
            numbers.add(7);
            numbers.add(5);
            numbers.add(4);
            System.out.println(numbers);
        }
    }
