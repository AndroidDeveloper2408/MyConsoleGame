package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcGoblin extends Character {

    public OrcGoblin(String race) {
        super(race);
    }

    //Deal damage method
    public void cudgelAttack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 20.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " do cudgel attack by " + 20.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }
}
