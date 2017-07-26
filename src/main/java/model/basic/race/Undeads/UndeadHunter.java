package model.basic.race.Undeads;

import model.basic.characterModel.Character;

public class UndeadHunter extends Character {

    private double shootFromTheBowDamage = 4.0;
    private double attackDamage = 2.0;

    //Deal damage method
    public void shootFromTheBow(Character defender){
        checkCurse();
        checkedDamage = checkDamage(shootFromTheBowDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() +
                " " + this.getClass().getSimpleName() + "  shoot from the bow and deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

    //Deal damage method
    public void attack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(attackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " deal " + checkedDamage + " damage to " + defender.getClass().getPackage().toString() +
                "  " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
