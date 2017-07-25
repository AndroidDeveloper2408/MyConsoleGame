package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadHunter extends Character{

    public UndeadHunter(String race) {
        super(race);
    }

    //Deal damage method
    public void shootFromTheBow(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 4.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + "shoot from the bow and deal " + 4.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

    //Deal damage method
    public void attack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 2.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " deal " + 2.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }
}
