import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BottleOfWater extends Product {
    private String name;
    private int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}";
    }

    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void getListOfAvailableWater() {
        List<String> allWater = new ArrayList<>(
                Arrays.asList("gas water", "non-gas water", "mineral water", "water with fruit juice"));
        System.out.println(allWater);
    }

}
