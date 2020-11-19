import java.util.Scanner;

public class ComputerStore {
    CPU cpu;
    Memory memory;
    SSD ssd;
    MainBoard mainboard;
    String name;
    double pricesum;
    public ComputerStore(String name, CPU cpu, Memory memory, SSD ssd, MainBoard mainboard) {//构造方法
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
        this.ssd = ssd;
        this.mainboard = mainboard;
        pricesum = cpu.price + memory.price + ssd.price + mainboard.price;
    }
    public void print(String ComName) {//输出信息
        System.out.println(ComName + "'s information:");
        cpu.print();
        memory.print();
        ssd.print();
        mainboard.print();
        System.out.print("\n");
        System.out.println("total price is " + pricesum);
        System.out.print("\n\n");
    }
    public void rename(String newname) {
        name = newname;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComputerStore ComputerA = new ComputerStore("ComputerA", Intel.cpu1, GSkill.memory1, Seagate.ssd1, Asus.MainBoard1);
        ComputerA.print(ComputerA.name);
        ComputerStore ComputerB = new ComputerStore("ComputerB", AMD.cpu2, Kingston.memory2, Seagate.ssd2, Gigabyte.MainBoard2);
        ComputerB.print(ComputerB.name);
        ComputerStore ComputerX = new ComputerStore("Universe TWO", AMD.cpu3, KLEVV.memory3, WestDigitals.ssd3, Gigabyte.MainBoard3);
        ComputerX.print(ComputerX.name);
        for(;;) {//一个小型的电脑改名
            System.out.println("IF you want to rename a computer, please input 1, 2, or 3. else: input 0 to exit");
            int x = sc.nextInt();
            Scanner sqc = new Scanner(System.in);
            System.out.println("Please input new name: ");
            String Nn = sqc.nextLine();
            switch (x)
            {
                case 1 :
                    ComputerA.rename(Nn);
                    System.out.println("\nRename successfully");
                    ComputerA.print(ComputerA.name);
                break;

                case 2 :
                    ComputerB.rename(Nn);
                    System.out.println("\nRename successfully");
                    ComputerB.print(ComputerB.name);
                break;

                case 3 :
                    ComputerX.rename(Nn);
                    System.out.println("\nRename successfully");
                    ComputerX.print(ComputerX.name);
                break;

                default :
                    System.out.println("You are so strange! Rename failed.");
            }
            if (x == 0) break;
        }
        sc.close();
    }
}
