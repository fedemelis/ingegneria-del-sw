import Giocattoli.Dinosauro;
import Giocattoli.Giocattolo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        FabbricaDinosauri fabbricaDinosauri = new FactoryDino();
        FabbricaGatti fabbricaGatti = new FactoryGatti();

        List<String> dino = List.of("trex", "triceratopo", "spinosauro");
        List<String> gatti = List.of("silvestro", "tom", "cat");

        for (int i = 0; i < 100; i++){
            Random rnd = new Random();
            fabbricaDinosauri.crea(dino.get(rnd.nextInt(0, dino.size())));
            fabbricaGatti.crea(gatti.get(rnd.nextInt(0, gatti.size())), i);
        }

        Iterator dinoIter = fabbricaDinosauri.getDinoArrayList().iterator();
        Iterator gattiIter = Arrays.stream(fabbricaGatti.getGattiList()).iterator();

        while(dinoIter.hasNext() && gattiIter.hasNext()){
            Giocattolo g = (Giocattolo) dinoIter.next();
            g.gioca();
            g = (Giocattolo) gattiIter.next();
            g.gioca();
        }

    }
}
