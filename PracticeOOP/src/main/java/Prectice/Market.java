package Prectice;

public class Market {
    public static void main(String[] args) {
    Banana banana=new Banana(50);
        Fruit fruit=new Fruit(80);
        Apple apple=new Apple(60);
       banana.makeJuice();
       apple.makeJuice();
       apple.seeds();
       banana.peel();
       Fruit b = new Banana(50);
       b.makeJuice();
       b=new Apple(50);
        ((Apple) b).seeds();


    }
}
