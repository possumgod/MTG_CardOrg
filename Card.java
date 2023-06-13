import java.util.ArrayList;

public class Card {
    private String name;
    private ArrayList<COLOR> colors;
    private Cost cost;
    private String desc;

    public enum COLOR {
        BLACK, BLUE, GREEN, WHITE, RED, COLORLESS;
    };

    public Card(String name, ArrayList<COLOR> colors, Cost cost, String desc){
        this.name = name;
        this.colors = colors;
        this.cost = cost;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public ArrayList<COLOR> getColors() {
        return colors;
    }
    public Cost getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return this.name + ": " + 
            "\nColor: " + this.colors + 
                "\nCost: " + this.cost +
                    "\nDescription: " + this.desc;
    }

    public static void main(String[] args) {
        ArrayList<COLOR> colors = new ArrayList<COLOR>();
        colors.add(COLOR.BLACK);
        Cost cost = new Cost(1, colors);
        Card c1 = new Card("Rancid Rats", colors, cost, "idk lol");
        System.out.println(c1);

        //reads csv for name, colors, int cost, each color cost (goes through from input), and description
    }
}