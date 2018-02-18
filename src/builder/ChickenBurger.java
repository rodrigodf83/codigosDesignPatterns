package builder;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 55.5f;
    }

    @Override
    public String name() {
        return "Chicken Burguer";
    }
}
