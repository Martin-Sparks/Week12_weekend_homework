package instruments;

import Behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int keys;

    public Piano(String name, String type, int buyvalue, int sellvalue, int keys) {
        super(name, type, buyvalue, sellvalue);
        this.keys = keys;

    }

    public String play(String sound) {
        return "Play keys " + sound;
    }

    public int getKeys(){
        return this.keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
