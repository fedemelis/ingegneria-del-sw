package Personaggi;

import FightBehavior.FightBehavior;
import MovementBehavior.MovementBehavior;
import Personaggi.Personaggio;

public class Guerriero extends Personaggio {
    public Guerriero(FightBehavior fb, MovementBehavior mb) {
        super(fb, mb);
    }

    public Guerriero(FightBehavior fb) {
        super(fb);
    }

    public Guerriero(MovementBehavior mb) {
        super(mb);
    }
}
