import java.util.ArrayList;
import java.util.List;

public abstract class Veicolo {
    String carrozzeria;
    String engine;
    String interni;



    void build(){
        ArrayList<String> parts = new ArrayList<String>(List.of(carrozzeria, engine, interni));
        for(String s: parts){
            System.out.println("assemblando..." + s + "\n");
        }
        System.out.println("finito!");
    }

}
