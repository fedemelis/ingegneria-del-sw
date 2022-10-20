import autopilot.AutoPilot;
import autopilot.AutoPilot2;
import carrozzeria.Carrozzeria;
import carrozzeria.CarrozzeriaPesante;
import engine.Engine;
import engine.Engine300;
import interni.Interni;
import interni.InterniComfort;
import nav.Nav;
import nav.Nav2;

public class UsaPartFactory implements PartFactory{
    @Override
    public Carrozzeria createCarrozzeria() {
        return new CarrozzeriaPesante();
    }

    @Override
    public Engine createEngine() {
        return new Engine300();
    }

    @Override
    public Interni createInterni() {
        return new InterniComfort();
    }

    @Override
    public Nav createNav() {
        return new Nav2();
    }

    @Override
    public AutoPilot createAutoPilot() {
        return new AutoPilot2();
    }
}
