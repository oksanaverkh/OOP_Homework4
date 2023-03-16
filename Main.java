import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным
 * полем int температура.
 * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 * и реализовать перегруженный метод getProduct(int name, int volume, int
 * temperature) выдающий продукт соответствующий имени, объему и температуре
 * 3. В main проинициализировать несколько ГорячихНапитков и
 * ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
 * 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
 **/

public class Main {
    public static void main(String[] args) {
        UniVendingMachine uniMachine1 = new UniVendingMachine<>("Hot drinks vending machine");
        UniVendingMachine uniMachine2 = new UniVendingMachine<>("Water vending machine");

        List<HotDrink> hotDrinksList = getHotDrinksList();
        List<BottleOfWater> bottlesOfWaterList = getBottlesOfWaterList();
        uniMachine1.initProduct(hotDrinksList);
        uniMachine2.initProduct(bottlesOfWaterList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a drink type: hot drinks or water: ");
        String choose = sc.nextLine();

        if (choose.equals("hot drinks")) {
            HotDrink h1 = new HotDrink(null, 0, 0, 0);
            System.out.println("Enter a hot drink name:");
            h1.getListOfAvailableDrinks();
            String name = sc.nextLine().toLowerCase();
            System.out.println("Enter a hot drink volume:");
            h1.getListOfAvailableVolumes();
            Integer volume = sc.nextInt();
            System.out.println("Enter a hot drink temperature:");
            h1.getListOfAvailableTemperarures();
            Integer temperature = sc.nextInt();

            System.out.println();
            List<HotDrink> chosenList = uniMachine1.getProduct(name);
            if (chosenList.isEmpty()) {
                System.out.println("No drinks with such criteria found");
            } else {

                for (int i = 0; i < chosenList.size(); i++) {
                    if (chosenList.get(i).getVolume() == volume && chosenList.get(i).getTemperature() == temperature) {
                        System.out.println(chosenList.get(i));
                    }
                }
            }

        } else if (choose.equals("water")) {
            System.out.println("Enter a water type:");
            BottleOfWater b1 = new BottleOfWater(null, 0);
            b1.getListOfAvailableWater();
            String name = sc.nextLine().toLowerCase();
            if (uniMachine2.getProduct(name).isEmpty()) {
                System.out.println("No drinks with such criteria found");
            } else
                System.out.println(uniMachine2.getProduct(name));

        } else
            System.out.println("Wrong data, try again");
        sc.close();
    }

    public static List getHotDrinksList() {
        List<HotDrink> hDrinks = new ArrayList<>();

        HotDrink hd1 = new HotDrink("americano", 100, 100, 70);
        HotDrink hd2 = new HotDrink("americano", 200, 200, 80);
        HotDrink hd3 = new HotDrink("americano", 350, 400, 80);
        HotDrink hd4 = new HotDrink("black tea", 90, 100, 70);
        HotDrink hd5 = new HotDrink("black tea", 120, 200, 80);
        HotDrink hd6 = new HotDrink("black tea", 180, 400, 80);
        HotDrink hd7 = new HotDrink("green tea", 90, 100, 70);
        HotDrink hd8 = new HotDrink("green tea", 120, 200, 80);
        HotDrink hd9 = new HotDrink("green tea", 180, 400, 80);
        HotDrink hd10 = new HotDrink("hot chocolate", 140, 100, 80);
        HotDrink hd11 = new HotDrink("hot chocolate", 250, 200, 80);
        HotDrink hd12 = new HotDrink("latte", 200, 200, 60);
        HotDrink hd13 = new HotDrink("latte", 350, 400, 60);

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

    public static List getBottlesOfWaterList() {
        List<BottleOfWater> bottles = new ArrayList<>();

        BottleOfWater b1 = new BottleOfWater("gas water", 100);
        BottleOfWater b2 = new BottleOfWater("non-gas water", 150);
        BottleOfWater b3 = new BottleOfWater("gas water", 80);
        BottleOfWater b4 = new BottleOfWater("mineral water", 100);
        BottleOfWater b5 = new BottleOfWater("water with fruit juice", 180);
        BottleOfWater b6 = new BottleOfWater("gas water", 100);
        BottleOfWater b7 = new BottleOfWater("mineral water", 120);
        BottleOfWater b8 = new BottleOfWater("non-gas water", 100);

        bottles.add(b1);
        bottles.add(b2);
        bottles.add(b3);
        bottles.add(b4);
        bottles.add(b5);
        bottles.add(b6);
        bottles.add(b7);
        bottles.add(b8);

        return bottles;
    }
}
