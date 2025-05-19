package week05;

public class Walking {

    public static void main(String[] args) {

        for (int j=1; j<=100; j++){

            if (j % 3 == 0){
                System.out.println("Jump " + j);

            }else{
                System.out.println("Step " + j);
            }
        }

        System.out.println("---------------------");

        // Declare variable steps and assign 50
        // When it reaches step 35, stop walking
        int steps = 50;
        for (int i=1; i<= steps ; i++ ){
            System.out.println("Step " + i);
            if (i==35){
                System.out.println("Stop walking");
                break;  // if you don't add this then it will keep going

            }
        }
    }
}
