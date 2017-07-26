package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcGoblin extends Character {

    private double cudgelAttackDamage = 20.0;

    //Deal damage method
    public void cudgelAttack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(cudgelAttackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " do cudgel attack by " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
