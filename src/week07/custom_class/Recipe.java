package week07.custom_class;

public class Recipe {

    //object has its data
    //inorder to use this variables we have to create an object
    public String name;
    public String ingredients;
    public int servingSize;
    public double cost;

    public void prepare(){
        System.out.println("Preparing " + name);
    }

    public double costPerPerson(){
        return  cost / servingSize;
    }

    @Override
    public String toString() {
        return "Recipe for " +
                 name + " will require these " +
                "ingredients:\n\t\t\t" + ingredients + "\n" +
                "This dish will serve " +
                + servingSize + " and cost a total of $"
                + cost + " to make.";
    }
}
