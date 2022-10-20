import autopilot.AutoPilot;
import carrozzeria.Carrozzeria;
import engine.Engine;
import interni.Interni;
import nav.Nav;

import java.util.ArrayList;
import java.util.List;

public abstract class Veicolo {
    String name;
    Carrozzeria carrozzeria;
    Engine engine;
    Interni interni;
    Nav nav;
    AutoPilot autoPilot;

    abstract void make();


    void build(){
        System.out.println("preparo: " + carrozzeria.getNome() + ", "+ engine.getNome() + ", "+ interni.getNome() + ", "+ nav.getNome() + ", "+ autoPilot.getNome());
        System.out.println("finito!");
    }

}
