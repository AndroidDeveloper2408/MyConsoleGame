package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadNecromancer extends Character{

    private double attackDamage = 5.0;

    //Send disease method
    public void sendDisease(Character defender){
        defender.setDiseaseStatus(true);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() + " send disease by enemy "
                + defender.getClass().getSimpleName() + " and him attack is now 50% less than the next move");
    }

    //Deal damage method
    public void attack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(attackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " +
                this.getClass().getSimpleName() + " attack by " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

}
