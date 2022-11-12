
import java.util.ArrayList;
import java.util.List;

public class Hold {

    private int maxWeight;
    private List<Suitcase> hold = new ArrayList<>();
    private int count = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            hold.add(suitcase);
            count++;
        } else {
            System.out.println("Item exceeds the weigh limit");
        }
    }

    public int totalWeight() {
        int weight = 0;
        if (hold.isEmpty()) {
            return 0;
        }
        for (Suitcase element : hold) {
            weight += element.totalWeight();
        }
        return weight;
    }

    public String toString() {
        return count + " suitcases(" + totalWeight() + " kg)";
    }

    public void printItems() {
        int i = 0;
        while (i < hold.size()) {
            hold.get(i).printItems();
            i++;
        }
    }

}
