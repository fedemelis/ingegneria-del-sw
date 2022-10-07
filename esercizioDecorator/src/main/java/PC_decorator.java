public abstract class PC_decorator implements PC{
    PC p;
    @Override
    public abstract int cost();

    @Override
    public abstract String desc();
}
