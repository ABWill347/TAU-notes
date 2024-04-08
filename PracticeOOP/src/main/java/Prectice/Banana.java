package Prectice;

public class Banana extends Fruit {
    public Banana(int calories) {
        super(calories);
    }
    public void peel() {
        System.out.println("Bananas have thin peels");
    }

    @Override
    public void makeJuice() {
        System.out.println("Bananas make amazing milkshakes");
    }
}
