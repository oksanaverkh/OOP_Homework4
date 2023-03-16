import java.util.List;
import java.util.ArrayList;

/**
 * UniVendingMachine
 */
public class UniVendingMachine<T extends Product> implements VendingMachine {
    List<T> list;
    private String name;

    public UniVendingMachine(String name) {
        this.list = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n", this.name);
    }

    public List<T> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }

    void initProduct(List<T> prod) {
        this.list = prod;
    }

    @Override
    public List getProduct(String name) {
        List<T> drinksList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)) {
                drinksList.add(list.get(i));
            }
        }
        return drinksList;
    }

}