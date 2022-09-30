import FightBehavior.FucilePlasmFB;
import FightBehavior.PacifistFB;
import FightBehavior.PistolaLaserFB;
import MovementBehavior.MotoSubsonicaMB;
import MovementBehavior.NaveInterstellareMB;
import MovementBehavior.TeletrasportoMB;
import Personaggi.Alieno;
import Personaggi.Guerriero;
import Personaggi.Personaggio;

public class test {
    public static void main(String[] args) {

        Personaggio g = new Guerriero(new PistolaLaserFB(), new NaveInterstellareMB());

        Personaggio a = new Alieno(new PacifistFB(), new TeletrasportoMB());

        g.setFb(new FucilePlasmFB());
        g.setMb(new MotoSubsonicaMB());

        g.getFb().fight();
        a.getFb().fight();


    }
}
