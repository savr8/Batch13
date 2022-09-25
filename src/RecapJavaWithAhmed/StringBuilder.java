package RecapJavaWithAhmed;

public class StringBuilder {
    /*

    POSSIBLE INTERVIEW QUESTIONS
    1-What is the difference between STRING AND STRINGBUILDER?
    *STRING IS IMMUTABLE
    *STRING BUILDER IS MUTABLE
    *STRING HAS MORE METHOD THAN STRINGBUILDER
    *STRINGBUILDER HAS DIFFERENT METHODS THAN STRING-->APPEND,REVERSE

    2-What is the difference between StringBuilder and String Buffer?
    StringBuffer is syncronized-->THREAD-SAFE
    *StringBuilder is non-synchronized-->NON_THREAD-SAFE
    NOTE:If you want to know more about syn then check JAVARECAPDAY4 video(MAP CONCEPT)

     */
    public static void main(String[] args) {
       //IMMUTABILITY
        String name ="Ahmet";
        name.concat("Baldir");
        System.out.println(name);//AHMET
        //MUTABILITY
     //   StringBuilder name1= new StringBuilder("Ahmet");
      //  name1.append("Baldir");
      //  System.out.println(name1);//Ahmet Baldir
    }
}
