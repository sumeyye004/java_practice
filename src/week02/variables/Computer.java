package week02.variables;

import java.util.Arrays;

public class Computer {
    /*
    Computer [variables, datatypes, printing]

        create a class Computer
        create a main method

        declare these variables with a datatype that matches it:
            brand, processor, ram, storage, price, number of usb slots, has bluetooth, has wifi card

        assign some value to all the variables

        print all the variables
     */
    public static void main(String[] args) {

        String brand = "Apple Macbook Pro";
        String processor = "M3 Pro";
        int ram = 16;
        String storage = "1 TB SSD";
        double price = 15100.0;
        byte numberOfUsbSlots = 3;
        var hasBluetooth = true;
        boolean hasWifiCard = true;

        System.out.println("My computer brand is " + brand);
        System.out.println("Processor is " + processor);
        System.out.println("Ram is " + ram + " GB");
        System.out.println("Storage = " + storage);
        System.out.println("Price = $" + price);
        System.out.println("Number of USB = " + numberOfUsbSlots);
        System.out.println("Has bluetooth = " + hasBluetooth);
        System.out.println("Has wife card = " + hasWifiCard);
    }
}
