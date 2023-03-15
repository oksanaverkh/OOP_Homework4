import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
 *    и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
**/ 

public class Main {
    public static void main(String[] args) {
        VendMachineHotDrinks hdMachine = new VendMachineHotDrinks();

        List<HotDrink>hotDrinksList = getHotDrinksList();
        hdMachine.initProduct(hotDrinksList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hot drink name:");
        HotDrink.getListOfAvailableDrinks();
        String name = sc.nextLine();
        System.out.println("Enter a hot drink volume:");
        HotDrink.getListOfAvailableVolumes();
        Integer volume = sc.nextInt();
        System.out.println("Enter a hot drink temperature:");
        HotDrink.getListOfAvailableTemperarures();
        Integer temperature = sc.nextInt();

        System.out.println();
        if (hdMachine.getProduct(name, volume, temperature).isEmpty()) {
            System.out.println("No drinks with such criteria found");
        } else System.out.println(hdMachine.getProduct(name, volume, temperature));
        
    }

    public static List getHotDrinksList() {
        List<HotDrink> hDrinks = new ArrayList<>();

        HotDrink hd1 = new HotDrink("Americano", 100, 100, 70);
        HotDrink hd2 = new HotDrink("Americano", 200, 200, 80);
        HotDrink hd3 = new HotDrink("Americano", 350, 400, 80);
        HotDrink hd4 = new HotDrink("Black tea", 90, 100, 70);
        HotDrink hd5 = new HotDrink("Black tea", 120, 200, 80);
        HotDrink hd6 = new HotDrink("Black tea", 180, 400, 80);
        HotDrink hd7 = new HotDrink("Green tea", 90, 100, 70);
        HotDrink hd8 = new HotDrink("Green tea", 120, 200, 80);
        HotDrink hd9 = new HotDrink("Green tea", 180, 400, 80);
        HotDrink hd10 = new HotDrink("Hot chocolate", 140, 100, 80);
        HotDrink hd11 = new HotDrink("Hot chocolate", 250, 200, 80);
        HotDrink hd12 = new HotDrink("Latte", 200, 200, 60);
        HotDrink hd13 = new HotDrink("Latte", 350, 400, 60);

        hDrinks.add(hd1);
        hDrinks.add(hd2);
        hDrinks.add(hd3);
        hDrinks.add(hd4);
        hDrinks.add(hd5);
        hDrinks.add(hd6);
        hDrinks.add(hd7);
        hDrinks.add(hd8);
        hDrinks.add(hd9);
        hDrinks.add(hd10);
        hDrinks.add(hd11);
        hDrinks.add(hd12);
        hDrinks.add(hd13);

        return hDrinks;
    }
}
