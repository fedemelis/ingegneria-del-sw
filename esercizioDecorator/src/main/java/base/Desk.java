package base;

import pc.PC;

public class Desk extends PC {

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String getDesc() {
        return "Desktop PC";
    }
}
