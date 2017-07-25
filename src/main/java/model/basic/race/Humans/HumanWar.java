package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanWar extends Character{

    public HumanWar(String race) {
        super(race);
    }

    //Deal damage method
    public void swordAttack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 18.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " do sword attack by " + 18.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

}
