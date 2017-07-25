package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanArbalester extends Character{

    public HumanArbalester(String race) {
        super(race);
    }

    //Deal damage method
    public void shootFromTheCrossBow(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 5.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + "shoot from the crossbow and deal " + 5.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

    //Deal damage method
    public void attack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 3.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " deal " + 3.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }
}
