import Giocattoli.*;

public class FactoryGatti extends FabbricaGatti{
    @Override
    public Giocattolo creaGiocattolo(String type) {
        if(type.equalsIgnoreCase("silvestro")){
            return new Silvestro();
        }
        if(type.equalsIgnoreCase("tom")){
            return new Tom();
        }
        if(type.equalsIgnoreCase("cat")){
            return new Cat();
        }
        return null;
    }
}
