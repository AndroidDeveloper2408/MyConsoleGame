package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcShaman extends Character {

    public OrcShaman(String race) {
        super(race);
    }

    //Send curse method
    public void sendCurse(Character defender){
        defender.setStatus(false);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " removes improve by enemy "
                + defender.getClass().getSimpleName().toString());
    }

    //Improve characteristic method
    public void improve(Character ally){
        ally.setStatus(true);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " improve him friends "
                + ally.getClass().getSimpleName().toString());
    }


}
