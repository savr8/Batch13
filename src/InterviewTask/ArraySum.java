package InterviewTask;

public class ArraySum {
    //find sum in array{2,3,4},int target =7;

    public static void main(String[] args) {
        int []nums ={2,3,4,6,5};
        int target=7;
        B13:
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                   // break B13;
                }
            }
        }

    }
}
