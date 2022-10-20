public class test {
    public static void main(String[] args) {
        LineaAssemblaggio lineaEuropa = new AssemblaggioEuropa();
        LineaAssemblaggio lineaUsa = new AssemblaggioUSA();

        Veicolo v = lineaEuropa.creaVeicolo("hyper");
        v.build();
        v = lineaUsa.creaVeicolo("mid");
        v.build();
    }
}
