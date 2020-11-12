public class CPU {
    String name;
    int coreNum;
    double price;
    public CPU(String n, int c, double p){
        name = n;
        coreNum = c;
        price = p;
    }

    public void print() {
        System.out.println(name + " : coreNum is " + coreNum + ", and the price is " + price);
    }
}

class Intel extends CPU {
    public Intel(String n, int c, double p){
        super(n ,c, p);
    }
    static Intel cpu1 = new Intel("i5-10955u", 6, 2458);
    public static void main(String[] args) {
        cpu1.print();
    }
}

class AMD extends CPU {
    public AMD(String n, int c, double p) {
        super(n, c, p);
    }
    static AMD cpu2 = new AMD("R5-4600h", 6, 2300);
    static AMD cpu3 = new AMD("R9-9800h", 16, 7980);
    public static void main(String[] args) {
        cpu2.print();
        cpu3.print();
    }
}

