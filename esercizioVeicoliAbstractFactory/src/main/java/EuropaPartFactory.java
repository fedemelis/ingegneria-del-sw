import autopilot.AutoPilot;
import autopilot.AutoPilot1;
import carrozzeria.Carrozzeria;
import carrozzeria.CarrozzeriaLeggera;
import engine.Engine;
import engine.Engine300;
import engine.Engine500;
import interni.Interni;
import interni.InterniSportivi;
import nav.Nav;
import nav.Nav1;

public class EuropaPartFactory implements PartFactory{
    @Override
    public Carrozzeria createCarrozzeria() {
        return new CarrozzeriaLeggera();
    }

    @Override
    public Engine createEngine() {
        return new Engine500();
    }

    @Override
    public Interni createInterni() {
        return new InterniSportivi();
    }

    @Override
    public Nav createNav() {
        return new Nav1();
    }

    @Override
    public AutoPilot createAutoPilot() { return new AutoPilot1(); }
}
