package Java;

public class Paint {

    ///////////////////////////////////////Attributes/////////////////////////////////////

    private String colour;
    private int coverage;



    /////////////////////////////////////Constructors//////////////////////////////////////////

    public Paint(String colour, int coverage){
        this.colour = colour;
        this.coverage = coverage;

    }
    /////////////////////////////////////Methods////////////////////////////////////////////

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCoverage() {
        return coverage;
    }

    public void setCoverage(int coverage) {
        this.coverage = coverage;
    }
}
