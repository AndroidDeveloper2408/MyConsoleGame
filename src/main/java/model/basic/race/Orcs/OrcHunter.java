package model.basic.race.Orcs;

import model.basic.characterModel.Character;

public class OrcHunter extends Character{

    private double shootFromTheBowDamage = 3.0;
    private double bladeAttackDamage = 2.0;


    //Deal damage method
    public void shootFromTheBow(Character defender){
        checkCurse();
        checkedDamage = checkDamage(shootFromTheBowDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " +
                this.getClass().getSimpleName()+ " shoot from the bow and deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

    //Deal damage method
    public void bladeAttack(Character defender){
        checkCurse();
        checkedDamage = checkDamage(bladeAttackDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " +
                this.getClass().getSimpleName() + " do blade attack by " + checkedDamage + " to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
