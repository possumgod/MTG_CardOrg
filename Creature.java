import java.util.ArrayList;

public class Creature extends Card {
    private int toughness;
    private int power;

    public Creature(String name, ArrayList<TYPE> types, ArrayList<Card.COLOR> colors, Cost cost, String desc, int toughness, int power) {
        super(name, types, colors, cost, desc);
        this.toughness = toughness;
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + 
            "\nPower/Toughness: " + power + "/" + toughness;
    }

    public static void main(String[] args) {
        ArrayList<COLOR> colors = new ArrayList<COLOR>();
        colors.add(COLOR.BLACK);
        Cost cost = new Cost(1, colors);
        ArrayList<TYPE> types = new ArrayList<TYPE>();
        types.add(TYPE.CREATURE);
        Creature c1 = new Creature("Rancid Rats", types, colors, cost, "idk lol", 1, 1);
        System.out.println(c1);

        //reads csv for name, colors, int cost, each color cost (goes through from input), and description in Database file
        //Card is generic type for other Types (liek creatures, enchantments, etc)
    }
}
