package BuilderPattern;

import BuilderPattern.Burger.ChickenBurger;
import BuilderPattern.Burger.VegBurger;
import BuilderPattern.ColdDrink.Pepsi;
import BuilderPattern.ColdDrink.Coke;

/**
 * @description:
 * @author: wwh
 * @create: 2020/6/23
 */
public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}