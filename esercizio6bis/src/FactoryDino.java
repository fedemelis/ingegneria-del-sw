import Giocattoli.Giocattolo;
import Giocattoli.Spinosauro;
import Giocattoli.Trex;
import Giocattoli.Triceratopo;

public class FactoryDino extends FabbricaDinosauri{
    @Override
    public Giocattolo creaGiocattolo(String type) {
        if(type.equalsIgnoreCase("trex")){
            return new Trex();
        }
        if(type.equalsIgnoreCase("triceratopo")){
            return new Triceratopo();
        }
        if(type.equalsIgnoreCase("spinosauro")){
            return new Spinosauro();
        }
        return null;
    }
}
