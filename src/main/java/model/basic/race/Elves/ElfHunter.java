package model.basic.race.Elves;

import model.basic.characterModel.Character;

public class ElfHunter extends Character {

    private double damageFromTheBow = 7.0;
    private double damageAttackTheEnemy = 3.0;

    //Deal damage method
    public void shootFromTheBow(Character defender){
        checkCurse();
        checkedDamage = checkDamage(damageFromTheBow);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName()+
                "shoot from the bow and deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

    //Deal damage method
    public void attackTheEnemy(Character defender){
        checkCurse();
        checkedDamage = checkDamage(damageAttackTheEnemy);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                "  deal " + checkedDamage + " damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }
}
