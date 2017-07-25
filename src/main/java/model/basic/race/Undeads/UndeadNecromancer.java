package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadNecromancer extends Character{

    public UndeadNecromancer(String race) {
        super(race);
    }

    //Send disease method
    public void sendDisease(Character defender){
        defender.setDisease(true);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " send disease by enemy "
                + defender.getClass().getSimpleName().toString() + " and him attack is now 50% less than the next move");
    }

    //Deal damage method
    public void attack(Character defender){
        defender.setHEALPOINTS(defender.getHEALPOINTS() - 5.0);
        System.out.println(race + " " + this.getClass().getSimpleName().toString() + " attack by " + 5.0 + " damage to " +
                defender.getRace() + " " + defender.getClass().getSimpleName().toString());
    }

}
