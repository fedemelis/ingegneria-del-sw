import Giocattoli.Dinosauro;
import Giocattoli.Giocattolo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FabbricaDinosauri implements FabbricaGiocattoli {

    ArrayList<Giocattolo> dinoArrayList;

    public FabbricaDinosauri() {
        dinoArrayList = new ArrayList<>();

    }

    public ArrayList<Giocattolo> getDinoArrayList() {
        return dinoArrayList;
    }

    public void crea(String s){
        dinoArrayList.add(creaGiocattolo(s));
    }

}
