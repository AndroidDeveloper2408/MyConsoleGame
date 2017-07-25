package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadZombie extends Character {

    public UndeadZombie(String race) {
        super(race);
    }

    //Deal damage method
    public void cudgelAttack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 18.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " do spear attack by " + 18.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }
}
