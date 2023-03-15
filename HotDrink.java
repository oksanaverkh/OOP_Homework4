import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotDrink extends Product{
    private String name;
    private int price;
    private int temperature;
    private int volume;

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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Hot Drink {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", volume = " + volume +
                ", temperature = " + temperature +
                '}';
    }

    public HotDrink(String name, int price, int volume, int temperature) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temperature = temperature;
    }

    public static void getListOfAvailableDrinks() {
        List<String> allDrinks = new ArrayList<>(Arrays.asList("Black tea", "Green tea", "Hot chocolate", "Americano", "Latte"));
        System.out.println(allDrinks);
    }

    public static void getListOfAvailableVolumes() {
        List<String> allVolumes = new ArrayList<>(Arrays.asList("100", "200", "400"));
        System.out.println(allVolumes);
    }

    public static void getListOfAvailableTemperarures() {
        List<String> allTemps = new ArrayList<>(Arrays.asList("60", "70", "80"));
        System.out.println(allTemps);
    }
        
}
