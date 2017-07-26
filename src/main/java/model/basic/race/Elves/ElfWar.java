package model.basic.race.Elves;

import model.basic.characterModel.Character;

public class ElfWar extends Character{

    private double swordAttackDamage = 3.0;

    //Deal damage method
    public void swordAttack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(swordAttackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " do sword attack by " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

}
