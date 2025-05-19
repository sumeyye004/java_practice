package week03;

public class ParkingLot {

    public static void main(String[] args) {

        System.out.println("----Welcome to Target!");
        int cars = 0;

        System.out.println("1 car parked");
        cars++;
        //cars = cars + 1;

        System.out.println("Cars in parking = " + cars);

        System.out.println("2 more cars parked");
        cars++;
        ++cars;
        // cars += 2;
        System.out.println("Cars in parking = " + ++cars);

        System.out.println("10 more cars parked");
        cars += 10;
        System.out.println("Cars in parking = " + cars);

        System.out.println("3 times more cars parked");
        cars *= 3;
        System.out.println("Cars in parking = " + cars);

        System.out.println("One car left");
        --cars;
        System.out.println("Cars in parking = " + cars);

        System.out.println("10 cars left");
        cars -= 10;
        System.out.println("Cars in parking = " + cars);




    }
}
