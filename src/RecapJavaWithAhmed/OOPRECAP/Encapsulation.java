package RecapJavaWithAhmed.OOPRECAP;

public class Encapsulation {
    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-What is encapsulation?Why do you use it ?
    NOTE:REMENBER bacteria example/post about cracking their security system from company.
    -->Encapsulation is a way to limit /restrict/protect/hide data from 3rd.party
    (foreign users/hackers/other classes)
    *It makes your data not accessible and manipulable(manipulation)by everyone.
    *It provides control over the data.
    *WE USE PRIVATE KEYWORD FOR VARIABLE AND METHOD

    2-How can you access the data from encapsulated class?

To be able to access the data from encapsulation,we use GETTERS and SETTERS
    3-If encapsulation is hiding the data from users/classes and with same methods.It seems
    they can still access them what is the point of using encapsulation?

 Actually,you can still access the data like you said,but you can make a specific implementation
 with a condition that you want to have for this task wich will "RESTRICT/LIMIT"users
 based on your condition.It means you protect your data to be manipulated as a negative way that
 you want to.Example=-15,-200page or10000page.These are the values that we do not
 want to see for our database.
 -->In real life:it gives you correct/accurate data for you/company.

     */
    public static void main(String[] args) {
        EncapsulationPractice example =new EncapsulationPractice();
        example.setAge(12);
        example.setAge(-15);
        example.setAge(101);
        System.out.println(example.getAge());
    }
}
