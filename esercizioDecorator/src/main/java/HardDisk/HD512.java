package HardDisk;
import pc.*;

public class HD512 extends PC_decorator {

    PC p;

    public HD512(PC p){
        this.p = p;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", HD-512GB";
    }

    @Override
    public int cost() {
        return p.cost() + 50;
    }
}