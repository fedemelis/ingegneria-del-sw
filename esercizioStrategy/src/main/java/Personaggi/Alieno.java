package Personaggi;

import FightBehavior.FightBehavior;
import MovementBehavior.MovementBehavior;
import Personaggi.Personaggio;

public class Alieno extends Personaggio {
    public Alieno(FightBehavior fb, MovementBehavior mb) {
        super(fb, mb);
    }

    public Alieno(FightBehavior fb) {
        super(fb);
    }

    public Alieno(MovementBehavior mb) {
        super(mb);
    }
}
