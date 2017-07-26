package model.basic.characterModel;


public class Character {

    protected boolean groupStatus = false; //View, what kind of group is character(vip/basic)
    protected double healpoints = 100.0; //character's heal points
    protected final String name = new Names().getName(); //set name, from the Names' class
    protected boolean diseaseStatus = false; //disease status
    protected double checkedDamage = 0.0; //checked damage
    protected boolean curseStatus = false; // curse status

    protected void checkCurse(){
        if(this.isCurseStatus())
        this.setGroupStatus(false);
    }

    protected double checkDamage(double damage){
        if(this.isDiseaseStatus())
            return damage/2;
        else if(this.isGroupStatus())
            return damage*1.5;
        else
            return damage;
    }

    protected void checkGroupStatus(){
        if(this.isGroupStatus())
            this.setGroupStatus(false);
    }

    public boolean isGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(boolean groupStatus) {
        this.groupStatus = groupStatus;
    }

    public double getHealpoints() {
        return healpoints;
    }

    public void setHealpoints(double healpoints) {
        this.healpoints = healpoints;
    }

    public boolean isCurseStatus() {
        return curseStatus;
    }

    public void setCurseStatus(boolean curseStatus) {
        this.curseStatus = curseStatus;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isDiseaseStatus() {
        return diseaseStatus;
    }

    public void setDiseaseStatus(boolean diseaseStatus) {
        this.diseaseStatus = diseaseStatus;
    }
}
