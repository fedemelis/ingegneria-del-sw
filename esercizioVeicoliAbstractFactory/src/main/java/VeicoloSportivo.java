public class VeicoloSportivo extends Veicolo{
    PartFactory fact;

    public VeicoloSportivo(PartFactory p){
        fact = p;
        name = "veicolo sportivo";
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
