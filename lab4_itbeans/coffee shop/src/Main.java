import com.beverage.Beverage;
import com.beverage.Cappuccino;
import com.beverage.Espresso;
import com.beverage.Latte;
import com.condiments.Milk;
import com.condiments.Sugar;


public class Main {
    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + espresso.cost());


        Cappuccino cappuccino = new Cappuccino(new Milk((Beverage) new Sugar()));
    }
}
