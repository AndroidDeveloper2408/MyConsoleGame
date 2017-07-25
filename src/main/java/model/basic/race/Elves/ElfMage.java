package model.basic.race.Elves;

import model.basic.characterModel.Character;

public class ElfMage extends Character {

    //Deal damage method
    public void dealMagicDamage(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 10.0);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName().toString() +
                " deal " + 10.0 + " magic damage to " + defender.getClass().getPackage().toString() +
                " " + defender.getClass().getSimpleName().toString());
    }

    //Improve characteristic method
    public void improve(Character ally){
        ally.setStatus(true);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName().toString() + " improve him friends "
                + ally.getClass().getSimpleName().toString());
    }


}
