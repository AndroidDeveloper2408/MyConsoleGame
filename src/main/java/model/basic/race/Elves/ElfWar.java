package model.basic.race.Elves;

import model.basic.characterModel.Character;

public class ElfWar extends Character{

    //Deal damage method
    public void swordAttack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 3.0);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName().toString() +
                " do sword attack by " + 3.0 + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName().toString());
    }

}
