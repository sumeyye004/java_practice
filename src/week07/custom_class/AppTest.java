package week07.custom_class;

public class AppTest {
    public static void main(String[] args) {

        //Create objects from App class
        App app1 = new App();
        app1.name = "Discord";
        app1.version = 0.325;
        app1.isFree = true;

        app1.run();
        app1.update();
        System.out.println(app1.isFree);

        // each object has its own value, its own behavior
        App app2 = new App();
        app2.name = "Maps";
        app2.version = 4.3;
        app2.isFree = true;

        app2.run();
        app2.update();
        System.out.println(app2.isFree);

        //haven't assigned the value so it will give the default value; string is null, double is 0.0, boolean is false
        App app3 = new App();
        app3.run();
        app3.update();

        System.out.println("-----------toString()---------");
        System.out.println(app1); //automatically calls toString method

        System.out.println(app2);
        System.out.println(app3);

    }
}
