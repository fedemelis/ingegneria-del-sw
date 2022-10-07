package RAM;

import pc.PC;
import pc.PC_decorator;

public class RAM16 extends PC_decorator {
    PC p;

    public RAM16(PC p){
        this.p = p;
    }

    @Override
    public int cost() {
        return p.cost() + 100;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", RAM-16GB";
    }
}
