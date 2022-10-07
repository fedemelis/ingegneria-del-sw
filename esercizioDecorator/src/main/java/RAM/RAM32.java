package RAM;

import pc.PC;
import pc.PC_decorator;

public class RAM32 extends PC_decorator {
    PC p;

    public RAM32(PC p){
        this.p = p;
    }

    @Override
    public int cost() {
        return p.cost() + 200;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", RAM-32GB";
    }
}