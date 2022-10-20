public abstract class LineaAssemblaggio {
    public Veicolo iniziaAssemblaggio(String type){
        Veicolo v;
        v = creaVeicolo(type);
        v.build();
        return v;
    }

    abstract Veicolo creaVeicolo(String type);
}
