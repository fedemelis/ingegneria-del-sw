public class ConcessionariaUsa extends Concessionaria{
    @Override
    public Veicolo creaVeicolo(String type) {
        Veicolo v;
        PartFactory fact = new UsaPartFactory();
        if(type.equals("sportiva")){
            v = new VeicoloSportivo(fact);
            v.name = "veicolo sportivo USA";
            return v;
        }
        else if(type.equals("comfort")){
            v = new VeicoloComfort(fact);
            v.name = "veicolo comfort USA";
            return v;
        }
        return null;
    }
}