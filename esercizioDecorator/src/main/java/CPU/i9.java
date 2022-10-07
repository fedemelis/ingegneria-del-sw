package CPU;

import pc.PC;
import pc.PC_decorator;

public class i9 extends PC_decorator {
    PC p;

    public i9(PC p){
        this.p = p;
    }
    @Override
    public int cost() {
        return p.cost() + 700;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", intel core i9";
    }
}
