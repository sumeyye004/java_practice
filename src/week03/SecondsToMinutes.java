package week03;

public class SecondsToMinutes {
    /*
    SecondsToMinutes [variables, remainder operator, concatenation]
        Declare and assign the following variables
            totalSeconds

        Declare minutes , calculate minutes in totalSeconds
        Declare seconds , calculate remaining seconds
        Display in this format:
        In 550 seconds - there are 9 minutes and 10 seconds
     */
    public static void main(String[] args) {

        int totalSeconds = 550;
        int minutes = totalSeconds / 60;
        int remainderSeconds = totalSeconds % 60;

        System.out.println("minutes = " + minutes);
        System.out.println("remainder seconds = " + remainderSeconds);

        System.out.println("In " + totalSeconds + " seconds - there are " + minutes + " minutes and " + remainderSeconds + " seconds");


    }
}
