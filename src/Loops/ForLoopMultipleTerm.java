package Loops;

public class ForLoopMultipleTerm {
    public static void main(String[] args) {

        int a = 9;
        //reassingning veriable in the loop
        for (a=5 ;a<17;a++){
            //a=10;-->this is going to cause infinite loop
            System.out.println("a is: "+a);
        }
        System.out.println("a after Loop:"+a);//7
        //multiple terms in for loop

        for (int i=0,k=10,m=25,c=0;i<10&&k>i;i++,k--){
            c++;
            System.out.println("i->"+i);
            System.out.println("k->"+k);
            System.out.println("m->"+m);
            //this loop runs ...times
            System.out.println("this loop runs "+c+ " times");
        //=======================================
            char  ch='t';
            double num=1.2;
            int count =0;
            for(double d =2.3;ch>'m'||d>=num;ch--,num++){
                System.out.println("*********");
                System.out.println(num+"<<num");
                System.out.println(ch +"<<ch");
                count++;
            }
            System.out.println(count);

        }
    }
}
