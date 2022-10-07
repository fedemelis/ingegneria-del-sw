package CPU;

import pc.PC;
import pc.PC_decorator;

public class i7 extends PC_decorator {
    PC p;

    public i7(PC p){
        this.p = p;
    }
    @Override
    public int cost() {
        return p.cost() + 350;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", intel core i7";
    }
}
