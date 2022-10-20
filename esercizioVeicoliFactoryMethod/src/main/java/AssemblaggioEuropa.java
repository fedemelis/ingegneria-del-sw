public class AssemblaggioEuropa extends LineaAssemblaggio{
    @Override
    Veicolo creaVeicolo(String type) {
        if (type.equals("low")){
            return new EuropaLowCar();
        }
        else if(type.equals("mid")){
            return new EuropaMidCar();
        }
        else if(type.equals("hyper")){
            return new EuropaHyperCar();
        }
        return null;
    }
}
