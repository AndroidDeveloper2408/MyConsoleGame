package model.basic.characterModel;


public class Character {

    protected boolean status = false; //View, what kind of group is character(vip/basic)
    protected double HEALPOINTS = 100.0; //character's heal points
    protected final String name = new Names().getName(); //set name, from the Names' class
    protected boolean disease = false; //status disease

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //getter
    public double getHEALPOINTS() {
        return HEALPOINTS;
    }

    //setter
    public void setHEALPOINTS(double HEALPOINTS) {
        this.HEALPOINTS = HEALPOINTS;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }
}
