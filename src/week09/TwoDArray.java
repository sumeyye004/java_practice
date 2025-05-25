package week09;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] nums = {
                {7, 1, 3},      //0
                {65, 8, 41},    //1
                {25, 11, 77}    //2

        };

        System.out.println(nums[0][0]);  //7
        System.out.println(nums[2][2]);  //77
        System.out.println(nums[1][1]);  //8
        System.out.println(nums[2][0]);  //25

        System.out.println(Arrays.deepToString(nums));

        System.out.println("---------for each loop----------");
        //for each loop
        for( int[] each1D : nums){
            for (int eachNum : each1D){
                System.out.print(eachNum + " ");
            }
            System.out.println();
        }

        System.out.println("----------for loop-------------");
        //for loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
