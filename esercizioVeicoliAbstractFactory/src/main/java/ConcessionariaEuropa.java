public class ConcessionariaEuropa extends Concessionaria{
    @Override
    public Veicolo creaVeicolo(String type) {
        Veicolo v;
        PartFactory fact = new EuropaPartFactory();
        if(type.equals("sportiva")){
            v = new VeicoloSportivo(fact);
            v.name = "veicolo sportivo europeo";
            return v;
        }
        else if(type.equals("comfort")){
            v = new VeicoloComfort(fact);
            v.name = "veicolo comfort europeo";
            return v;
        }
        return null;
    }
}
