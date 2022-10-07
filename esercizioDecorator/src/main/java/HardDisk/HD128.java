package HardDisk;

import pc.*;

public class HD128 extends PC_decorator {

    PC p;

    public HD128(PC p){
        this.p = p;
    }

    @Override
    public String getDesc() {
        return p.getDesc() + ", HD-128GB";
    }

    @Override
    public int cost() {
        return p.cost() + 20;
    }
}
