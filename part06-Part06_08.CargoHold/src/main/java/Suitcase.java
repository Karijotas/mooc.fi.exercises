
import java.util.*;

public class Suitcase {

    private List<Item> items = new ArrayList<>();
    private int maxweight;
    private int count = 0;

    public Suitcase(int maxweight) {
        this.maxweight = maxweight;
    }

    public int totalWeight() {
        int weight = 0;
        if (items.isEmpty()) {
            return 0;
        }
        for (Item element : items) {
            weight += element.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxweight) {
            items.add(item);
            count++;
        } else {
            System.out.println("Item exceeds the weigh limit");
        }
    }

    public String toString() {
        if (count == 0) {
            return "no items (" + totalWeight() + " kg)";
        }
        if (count == 1) {
            return count + " item (" + totalWeight() + " kg)";
        }
        return count + " items (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item element : items) {
            System.out.println(element);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        return items.stream().sorted(Comparator.comparing(Item::getWeight).reversed()).findFirst().get();

    }
}
