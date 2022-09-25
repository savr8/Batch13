package primitives;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class LogicalNegation {
    public static void main(String[] args) {
        //LogicalNegation--> !-->it will be used on boolean veraibles or boolean conditian
        boolean isRed =!false;
        System.out.println(isRed);//-->true
        System.out.println(isRed);
        System.out.println(isRed);
        System.out.println(!isRed);//-->false

        System.out.println(5==5);//true
        System.out.println(!(5==5));//false

        System.out.println(true== false);//false
        System.out.println(!((true==false)==(true==false)));//false



    }
}
