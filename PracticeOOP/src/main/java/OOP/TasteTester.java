package OOP;

public class TasteTester {
    public static void main(String[] args) {
        Cake cake =new Cake();
        cake.setFlavor("Yellow Cake");
        cake.setPrice(25);
        Birthday birthday=new Birthday();
        birthday.setPrice(50);
        birthday.setCandles(28);
        WeddingCake weddingCake=new WeddingCake();
        weddingCake.setTiers(12);
        birthday.setFlavor("Blue berry");


        System.out.println("Getting price for birthday "+birthday.getPrice());
        System.out.println("Getting price for cake "+cake.getPrice());
        System.out.println("Getting flavor for cake "+cake.getFlavor());
        System.out.println("Getting number of birthday candles "+birthday.getCandles());
        System.out.println("Getting tiers of cakes "+weddingCake.getTiers());
        System.out.println("Getting flavor of birthday cake "+birthday.getFlavor());
        
    }
}
