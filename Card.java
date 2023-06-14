import java.util.ArrayList;

public class Card {
    private String name;
    private ArrayList<TYPE> types;
    private ArrayList<COLOR> colors;
    private Cost cost;
    private String desc;

    public enum COLOR {
        BLACK, BLUE, GREEN, WHITE, RED, COLORLESS;
    };

    public enum TYPE {
        CREATURE, INSTANT, ENCHANTMENT, SORCERY, LAND, PLANESWALKER, ARTIFACT;
    }

    public Card(String name,  ArrayList<TYPE> types, ArrayList<COLOR> colors, Cost cost, String desc){
        this.name = name;
        this.types = types;
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
    public ArrayList<TYPE> getTypes() {
        return types;
    }
    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return this.name + ": " + 
            "\nColor: " + this.colors + 
                "\nCost: " + this.cost +
                    "\nType: " + this.types +
                        "\nDescription: " + this.desc;
    }
}