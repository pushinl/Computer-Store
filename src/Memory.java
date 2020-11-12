public class Memory {
    String name;
    String volume;
    double price;
    public Memory(String n, String v, double p){
        name = n;
        volume = v;
        price = p;
    }
    public void print() {
        System.out.println(name + " : volume is " + volume + ", and the price is " + price);
    }
}
class Samsung extends Memory {
    public Samsung(String n, String v, double p) {
        super(n, v, p);
    }
    static Samsung memory1 = new Samsung("Samsung-EDA", "16GB", 1028);
    public static void main(String[] args) {
        memory1.print();
    }
}
class Kingston extends Memory {
    public Kingston(String n, String v, double p) {
        super(n, v, p);
    }
    static Kingston memory2 = new Kingston("Kingston-boki", "16GB", 1328);
    static Kingston memory3 = new Kingston("Kingston-KINGboki", "32GB", 3228);
    public static void main(String[] args) {
        memory2.print();
        memory3.print();
    }
}