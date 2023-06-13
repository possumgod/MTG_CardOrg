import java.util.ArrayList;

public class Cost {
    private int n;
    private ArrayList<Card.COLOR> colors;

    public Cost(int n, ArrayList<Card.COLOR> colors){
        this.n = n;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return this.n + " " + this.colors;
    }
}
