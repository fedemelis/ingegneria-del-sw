public class VeicoloComfort extends Veicolo{
    PartFactory fact;

    public VeicoloComfort(PartFactory p){
        fact = p;
        name = "veicolo comfort";
    }
    @Override
    void make() {
        System.out.println("richiesto: " + name);
        carrozzeria = fact.createCarrozzeria();
        engine = fact.createEngine();
        interni = fact.createInterni();
        nav = fact.createNav();
        autoPilot = fact.createAutoPilot();

    }
}
