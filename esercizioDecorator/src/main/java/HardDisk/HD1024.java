package HardDisk;

import pc.*;

public class HD1024 extends PC_decorator {
    PC p;

    public HD1024(PC p){
        this.p = p;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", HD-1024GB";
    }

    @Override
    public int cost() {
        return p.cost() + 70;
    }
}