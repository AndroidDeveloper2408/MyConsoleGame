package model.basic.race.Elves;

import model.basic.characterModel.Character;

public class ElfHunter extends Character{

    //Deal damage method
    public void shootFromTheBow(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 7.0);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName().toString() +
                "shoot from the bow and deal " + 7.0 + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName().toString());
    }

    //Deal damage method
    public void attackTheEnemy(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 3.0);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName().toString() +
                " deal " + 3.0 + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName().toString());
    }
}
