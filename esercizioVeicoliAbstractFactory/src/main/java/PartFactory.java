import autopilot.AutoPilot;
import carrozzeria.Carrozzeria;
import engine.Engine;
import interni.Interni;
import nav.Nav;

public interface PartFactory {
    public Carrozzeria createCarrozzeria();
    public Engine createEngine();
    public Interni createInterni();
    public Nav createNav();
    public AutoPilot createAutoPilot();
}
