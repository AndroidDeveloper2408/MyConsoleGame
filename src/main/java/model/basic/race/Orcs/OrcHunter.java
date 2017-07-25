package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcHunter extends Character{

    public OrcHunter(String race) {
        super(race);
    }

    //Deal damage method
    public void shootFromTheBow(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 3.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + "shoot from the bow and deal " + 3.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

    //Deal damage method
    public void bladeAttack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 2.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " do blade attack by " + 2.0 + " to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }
}
