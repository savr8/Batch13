package primitives;

public class TruthTableTask {
    public static void main(String[] args) {

        /*
        Average score of3 exams needs to be 70 % or More
        participation rate needs to be 80% or more
        Complition of homework needs to be 90% or more
        -Print a message to teh user if they can pass/not(true /false)
        */

     int exam1 = 100,exam2=60,exam3=50,reqAve=70,reqParticipation=80,myParticipation=100,reqHW = 90,myHW=100;
       double myAve=(exam1+ exam2+exam3)/3;
        System.out.println(myAve);
      boolean examPass = myAve>=reqAve;
      boolean partPass=myParticipation>= reqParticipation;
      boolean HWPass= myHW>=reqHW;
        System.out.println("Are you passing the course?"+(examPass && HWPass && partPass));

       //B+2 == 3+C|| !TRUE &&C<B/3
        int b=6,c = 2;
        //                  1         2        3
        //                false     false false  false
        boolean result = b+2==3*c|| !true&& c < b / 3;
        //               8    6     false   2   2
        System.out.println(result);

    }
}
