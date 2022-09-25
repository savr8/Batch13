package Arrays;

public class Task3 {
    public static void main(String[] args) {

        //find out the  largest number from this given array
//find the smallest number from this array

        int[] studentIds = {44, 67, 5, 21, 55, -35, 500};
        int largest = studentIds[0];
        for (int i = 0; i < studentIds.length; i++) {
            if (studentIds[i] > largest) {
                largest = studentIds[i];
            }
        }
        System.out.println("The Largest number is: "+largest);
    int smallest=studentIds[0];
    for  (int i=0;i<studentIds.length;i++){
        if (studentIds[i]<smallest){
            smallest=studentIds[i];
        }
    }
        System.out.println("The Smallest number is : "+smallest);


    }
}
