public class AssemblaggioUSA extends LineaAssemblaggio{
    @Override
    Veicolo creaVeicolo(String type) {
        if (type.equals("low")){
            return new UsaLowCar();
        }
        else if(type.equals("mid")){
            return new UsaMidCar();
        }
        else if(type.equals("hyper")){
            return new UsaHyperCar();
        }
        return null;
    }
}
