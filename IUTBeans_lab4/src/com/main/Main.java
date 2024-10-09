package com.main;



import com.beverage.IBeverage;
import com.beverage.Latte;
import com.condiment.Hazelnut;
import com.condiment.ICondiment;
import com.condiment.Milk;

public class Main {
    public static void main(String[] args) {

        IBeverage coffee = new Latte();


        coffee = addCondiments(coffee, new Hazelnut(), new Milk(), new Milk());


        System.out.println("Final Order: " + coffee.getDescription());
        System.out.println("Total Price: $" + coffee.getCost());
    }


    private static IBeverage addCondiments(IBeverage beverage, ICondiment... condiments) {
        for (ICondiment condiment : condiments) {
            beverage = condiment;
        }
        return beverage;
    }
}
