package Prectice;

public class Apple extends Fruit{

    public Apple(int calories) {
        super(calories);
    }public void seeds(){
        System.out.println("There are plenty seeds in the apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apples make amazing apple juice");
    }
}
