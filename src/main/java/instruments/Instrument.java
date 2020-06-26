package instruments;

public abstract class Instrument {

    private String name;
    private String type;
    private int buyvalue;
    private int sellvalue;


    public Instrument(String name, String type, int buyvalue, int sellvalue){
        this.name = name;
        this.type = type;
        this.buyvalue = buyvalue;
        this.sellvalue = sellvalue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBuyvalue(int buyvalue) {
        this.buyvalue = buyvalue;
    }

    public void setSellvalue(int sellvalue) {
        this.sellvalue = sellvalue;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBuyvalue() {
        return buyvalue;
    }

    public int getSellvalue() {
        return sellvalue;
    }
}
