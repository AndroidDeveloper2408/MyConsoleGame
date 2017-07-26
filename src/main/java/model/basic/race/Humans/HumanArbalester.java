package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanArbalester extends Character{

    private double shootFromTheCrossBowDamage = 5.0;
    private double attackDamage = 3.0;

    //Deal damage method
    public void shootFromTheCrossBow(Character defender){
        checkCurse();
        checkedDamage = checkDamage(shootFromTheCrossBowDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                "shoot from the crossbow and deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString()+ " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

    //Deal damage method
    public void attack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(attackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
