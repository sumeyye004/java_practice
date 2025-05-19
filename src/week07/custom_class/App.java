package week07.custom_class;
/*
Class App

Instance variables:
    name, double version, isFree

Instance methods:
    run()
        name is running
    update()
        version add 1.1 to it
        name is updating to version $version

    toString()
        generate
 */

public class App {

    //They are called data/instance variables/fields/attributes
    public String name;
    public double version;
    public boolean isFree;

    //The value is given inside of the object

    //methods --> methods are used for to process the data
    //instance methods --> you cant add static inside this method cause with static it becomes the class method
    public void run(){
        System.out.println(name + " is running");
    }

    public void update(){
        version += 1.1;
        System.out.println(name + " is updating to version " + version);
    }

    // toString method is used to describe the object
    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                '}';
    }
}
