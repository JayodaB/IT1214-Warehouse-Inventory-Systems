import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String id) {
        items.removeIf(i -> i.getItemId().equalsIgnoreCase(id));
    }

    public Item searchItem(String query) {
        for (Item i : items) {
            if (i.getItemId().equalsIgnoreCase(query) || i.getItemName().equalsIgnoreCase(query)) return i;
        }
        return null;
    }

    public void displayAll() {
        if (items.isEmpty()) System.out.println("Inventory Empty!");
        else items.forEach(System.out::println);
    }
}