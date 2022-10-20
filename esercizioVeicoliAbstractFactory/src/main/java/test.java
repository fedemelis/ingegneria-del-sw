public class test {
    public static void main(String[] args) {
        Concessionaria c = new ConcessionariaUsa();
        Veicolo v = c.ordinaVeicolo("sportiva");
        v.build();
    }
}
