package Personaggi;

import FightBehavior.FightBehavior;
import MovementBehavior.MovementBehavior;

public class Personaggio {
    FightBehavior fb;
    MovementBehavior mb;

    public Personaggio(FightBehavior fb, MovementBehavior mb) {
        setFb(fb);
        setMb(mb);
    }

    public Personaggio(FightBehavior fb) {
        setFb(fb);
    }


    public FightBehavior getFb() {
        return fb;
    }

    public MovementBehavior getMb() {
        return mb;
    }

    public Personaggio(MovementBehavior mb) {
        setMb(mb);

    }

    public void setFb(FightBehavior fb) {
        this.fb = fb;
    }

    public void setMb(MovementBehavior mb) {
        this.mb = mb;
    }
}
