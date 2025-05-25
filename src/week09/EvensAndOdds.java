package week09;

public class EvensAndOdds {

    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 3, 4};
        System.out.println("count Odds = " + countOdds(nums));
        System.out.println("count Evens = " + countEvens(nums));
    }
    public static int countEvens(int[] nums){

        int count = 0;
        for( int n : nums){
            if( n % 2 == 0){
                count ++;
            }
        }
        return count;
    }

    public static int countOdds(int[] nums){

        int count = 0;

        for (int n : nums){
            if (n % 2 != 0){
                count ++;
            }
        }
        return count;
    }
}
