package week07.custom_class;

public class RecipeTest {

    public static void main(String[] args) {

        Recipe recipe = new Recipe();
        recipe.name = "Pizza";
        recipe.ingredients = "Flour, Sauce, Sausages, Chicken";
        recipe.servingSize = 4;
        recipe.cost = 35.00;

        System.out.println(recipe);

        recipe.prepare();
        System.out.println("recipe.costPerPerson() = " + recipe.costPerPerson());
    }
}
