import com.beverage.ICoffee;
import com.beverage.Latte;
import com.condiment.Hazelnut;
import com.condiment.Milk;
import com.condiment.Sugar;

public class Main {
    public static void main(String[] args) {
        ICoffee coffee = new Latte();
        System.out.println();
        System.out.println("Base Order -> " + coffee.getDescription());

        System.out.println("Adding condiments to the coffee...");
        coffee.add(new Hazelnut(new Milk(new Sugar(null))));

        System.out.println();
        System.out.println("Final Order -> " + coffee.getDescription());
        System.out.println("Price -> $" + coffee.getCost());
        System.out.println();
    }
}