public class Desk implements PC{

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String desc() {
        return "desktop";
    }
}
