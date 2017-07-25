package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanMage extends Character {

    public HumanMage(String race) {
        super(race);
    }

    //Deal damage method
    public void dealMagicDamage(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 4.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " deal " + 4.0 + " magic damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

    //Improve characteristic method
    public void improve(Character ally){
        ally.setStatus(true);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " improve him friends "
                + ally.getClass().getSimpleName().toString());
    }


}
