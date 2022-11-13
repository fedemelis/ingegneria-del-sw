import Giocattoli.Giocattolo;

import java.awt.*;
import java.util.ArrayList;

public abstract class FabbricaGatti implements FabbricaGiocattoli{

    private Giocattolo[] gattiList;

    public Giocattolo[] getGattiList() {
        return gattiList;
    }

    public FabbricaGatti() {
        gattiList = new Giocattolo[100];

    }

    public  Giocattolo[] getDinoArrayList() {
        return gattiList;
    }

    public void crea(String s, int index){
        gattiList[index] = creaGiocattolo(s);
    }

}
