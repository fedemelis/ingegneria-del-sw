package CPU;

import pc.PC;
import pc.PC_decorator;

public class i3 extends PC_decorator {
    PC p;

    public i3(PC p){
        this.p = p;
    }
    @Override
    public int cost() {
        return p.cost() + 100;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", intel core i3";
    }
}
