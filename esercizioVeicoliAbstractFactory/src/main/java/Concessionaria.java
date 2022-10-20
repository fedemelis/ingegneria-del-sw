public abstract class Concessionaria extends Veicolo{
    Veicolo v;
    public Veicolo ordinaVeicolo(String type){
        v = creaVeicolo(type);
        make();
        //v.build();
        return v;
    }

    @Override
    public void make(){
        v.make();
    }

    protected abstract Veicolo creaVeicolo(String type);
}
