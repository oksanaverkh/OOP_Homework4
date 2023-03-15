import java.util.*;

public class VendMachineHotDrinks extends VendingMachine {
    List<HotDrink> hotDrinks = new ArrayList<>();

    void initProduct(List<HotDrink> cup) {
        this.hotDrinks = cup;
    }

    @Override
    String getProduct(String name) {
        for (HotDrink h : hotDrinks) {
            if (h.getName().contains(name))
                return h.getName() + " " + h.getPrice() + " " + h.getTemperature();
        }
        return new HotDrink("Not found", 0, 0, 0).toString();
    }

    String getProduct(String name, int volume, int temperature) {
        List<HotDrink> hotDrinksList = new ArrayList<>();
        for (HotDrink h : hotDrinks) {
            if (h.getName().contains(name) && h.getVolume() == volume && h.getTemperature() == temperature) {
                hotDrinksList.add(h);
            }
        }
        return hotDrinksList.toString();
    }

}
