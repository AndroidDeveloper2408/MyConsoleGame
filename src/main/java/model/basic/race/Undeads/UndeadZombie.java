package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadZombie extends Character {


    private double spearAttackDamage = 18.0;

    //Deal damage method
    public void spearAttack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(spearAttackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " do spear attack by " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
