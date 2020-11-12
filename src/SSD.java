public class SSD {
    String name;
    String volume;
    double price;
    public SSD(String n, String v, double p){
        name = n;
        volume = v;
        price = p;
    }
    public void print() {
        System.out.println(name + " : volume is " + volume + ", and the price is " + price);
    }
}

class Seagate extends SSD {
    public Seagate(String n, String v, double p) {
        super(n, v, p);
    }
    static Seagate ssd1 = new Seagate("SeaX", "512GB", 1040);
    static Seagate ssd2 = new Seagate("SeaY", "1TB", 2280);

    public static void main(String[] args) {
        ssd1.print();
        ssd2.print();
    }
}

class WestDigitals extends SSD {
    public WestDigitals(String n, String v, double p) {
        super(n, v, p);
    }
    static WestDigitals ssd3 = new WestDigitals("SumX", "2TB", 3040);
    public static void main(String[] args) {
        ssd3.print();
    }
}
