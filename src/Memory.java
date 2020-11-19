public class Memory {
    String name;
    String volume;
    double price;

    public Memory(String n, String v, double p) {
        name = n;
        volume = v;
        price = p;
    }

    public void print() {
        System.out.println(name + " : the volume is " + volume + ", and the price is " + price);
    }
}

class GSkill extends Memory {
    public GSkill(String n, String v, double p) {
        super(n, v, p);
    }

    static GSkill memory1 = new GSkill("GSkill-TridentZ", "16GB", 799);

    public static void main(String[] args) {
        memory1.print();
    }
}

class Kingston extends Memory {
    public Kingston(String n, String v, double p) {
        super(n, v, p);
    }

    static Kingston memory2 = new Kingston("Kingston-boki", "16GB", 1328);

    public static void main(String[] args) {
        memory2.print();
    }
}

class KLEVV extends Memory {
    public KLEVV(String n, String v, double p) {
        super(n, v, p);
    }

    static KLEVV memory3 = new KLEVV("KLEVV-BoltX", "32GB", 759);

    public static void main(String[] args) {
        memory3.print();
    }
}
