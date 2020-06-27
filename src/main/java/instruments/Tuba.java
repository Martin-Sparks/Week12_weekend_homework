package instruments;

import Behaviours.IPlay;

public class Tuba extends Instrument implements IPlay {

    private int valves;

    public Tuba(String name, String type, int buyvalue, int sellvalue, int valves) {
        super(name, type, buyvalue, sellvalue);
        this.valves = valves;
    }

    public String play(String sound) {
        return "Play sound " + sound;
    }

    public int getValves() {
        return this.valves;
    }

    public int setValves(int valves){
        return this.valves = valves;

    }
}
