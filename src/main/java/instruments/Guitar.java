package instruments;

import Behaviours.IPlay;

public class Guitar extends Stringed implements IPlay {

    private int strings;

    public Guitar(String name, String type, int buyvalue, int sellvalue, int strings) {
        super(name, type, buyvalue, sellvalue);
        this.strings = strings;
    }

    public String play(String sound) {
        return "Play sound " + sound;
    }

    public int getStrings() {
        return this.strings;
    }

    public int setStrings(int i){
        return this.strings = i;
    }
}
