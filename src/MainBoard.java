public class MainBoard {
    String name;
    String speed;
    double price;
    public MainBoard(String n, String ee, double p){
        name = n;
        speed = ee;
        price = p;
    }
    public void print() {
        System.out.println("MainBoard: " + name + " : speed is " + speed + ", and the price is " + price);
    }
}
class Asus extends MainBoard {
    public Asus(String n, String v, double p) {
        super(n, v, p);
    }
    static Asus MainBoard1 = new Asus("Asus-EVA", "2000r", 1028);
    public static void main(String[] args) {
        MainBoard1.print();
    }
}
class Gigabyte extends MainBoard {
    public Gigabyte(String n, String v, double p) {
        super(n, v, p);
    }
    static Gigabyte MainBoard2 = new Gigabyte("Gigabyte-realboki", "3700r", 1452);
    static Gigabyte MainBoard3 = new Gigabyte("Gigabyte-KINGreatrealboki", "10000r" , 6666);
    public static void main(String[] args) {
        MainBoard2.print();
        MainBoard3.print();
    }
}