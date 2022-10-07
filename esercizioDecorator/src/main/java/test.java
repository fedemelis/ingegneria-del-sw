import CPU.i9;
import HardDisk.HD1024;
import HardDisk.HD128;
import RAM.RAM32;
import base.Desk;
import pc.PC;

public class test {
    public static void main(String[] args) {
        PC p = new Desk();
        p = new HD1024(p);
        p = new HD1024(p);
        p = new HD1024(p);
        p = new i9(p);
        p = new RAM32(p);

        System.out.println(p.getDesc() + " " + p.cost() + "€");
    }
}
