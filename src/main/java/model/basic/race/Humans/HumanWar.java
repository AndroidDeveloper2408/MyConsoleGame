package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanWar extends Character{

    private double swordAttackDamage = 18.0;

    //Deal damage method
    public void swordAttack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(swordAttackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(    this.getClass().getPackage().toString()
                + "  " + this.getClass().getSimpleName() + " do sword attack by " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

}
