package week10;

import java.util.ArrayList;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {

        //raw type arrayList - which is not recommended
        //it can accept any data type
        ArrayList rawList = new ArrayList();
        rawList.add(100);
        rawList.add("java");
        rawList.add(10.3);
        rawList.add(true);
        System.out.println("rawList = " + rawList);

        //ArrayList with only Integers
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(325);
        nums.add(23);
        nums.add(11);
        System.out.println("nums = " + nums);

        nums.add(33);
        //add number to specific index
        //add 88 to index 0
        nums.add(0, 88);
        System.out.println("nums = " + nums);

        nums.add(2,95);
        System.out.println("nums = " + nums);

        //change the value at certain index
        //index 0 - change to 188
        nums.set(0, 188);
        System.out.println("nums = " + nums);


        //double the value at index 1
        nums.set(1, nums.get(1) * 2);
        System.out.println("nums = " + nums);

        //read value from certain index
        System.out.println(nums.get(0));
        System.out.println(nums.get(1));

        System.out.println("size = " + nums.size());

        // print the last element in list
        System.out.println("last = " + nums.get(nums.size()-1));

        //create String arrayList colors and assign different colors
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("blue", "grey", "brown", "black", "purple", "pink", "white"));

        System.out.println("colors = " + colors);
        System.out.println("size = " + colors.size());
        
        colors.add("yellow");
        System.out.println("colors = " + colors);

        //loop through arrayList
        //for each loop, for loop
        for (String each: colors) {
            System.out.println("colors = " + each);
        }

        System.out.println("----------for loop-------------");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(i + " - " +colors.get(i));
        }


        //System.out.println(colors.get(10));  IndexOutOfBoundsException

        //remove values from arrayList

        //remove by index:
        colors.remove(1);
        System.out.println("colors = " + colors);

        //remove by value
        colors.remove("yellow");
        System.out.println("colors = " + colors);

        //remove colors that start with 'b'
        colors.removeIf(color -> color.startsWith("b"));
        colors.removeIf(color -> color.length() == 4);  //it will remove according to num
        System.out.println("colors = " + colors);

        //clear the list. remove all elements
        colors.clear();
        System.out.println("colors = " + colors);
        System.out.println(colors.isEmpty());

        //remove all the numbers that are less than 100:
        nums.removeIf(num -> num < 100);
        System.out.println("nums = " + nums);









    }
}
