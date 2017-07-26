package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcShaman extends Character {

    //Send curse method
    public void sendCurse(Character defender){
        defender.setGroupStatus(false);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " removes improve by enemy " + defender.getClass().getPackage().toString() + " "
                + defender.getClass().getSimpleName());
    }

    //Improve characteristic method
    public void improve(Character ally){
        ally.setGroupStatus(true);
        System.out.println(this.getClass().getPackage().toString() +
                " " + this.getClass().getSimpleName() + " improve him friends "
                + ally.getClass().getSimpleName());
    }


}
