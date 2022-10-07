package CPU;

import pc.PC;
import pc.PC_decorator;

public class i5 extends PC_decorator {
    PC p;

    public i5(PC p){
        this.p = p;
    }
    @Override
    public int cost() {
        return p.cost() + 200;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", intel core i5";
    }
}
