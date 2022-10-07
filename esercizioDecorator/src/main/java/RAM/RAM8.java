package RAM;

import pc.PC;
import pc.PC_decorator;

public class RAM8 extends PC_decorator {

    PC p;

    public RAM8(PC p){
        this.p = p;
    }

    @Override
    public int cost() {
        return p.cost() + 50;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", RAM-8GB";
    }
}
