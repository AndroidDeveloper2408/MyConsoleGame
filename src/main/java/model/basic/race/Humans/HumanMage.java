package model.basic.race.Humans;

import model.basic.characterModel.Character;

public class HumanMage extends Character {

    private double magicDamage = 4.0;

    //Deal damage method
    public void dealMagicDamage(Character defender){
        checkCurse();
        checkedDamage = checkDamage(magicDamage);
        defender.setHealpoints(defender.getHealpoints() - checkedDamage);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                "  deal " + checkedDamage + " magic damage to " +
                defender.getClass().getPackage().toString() + " " + defender.getClass().getSimpleName());
        checkGroupStatus();
    }

    //Improve characteristic method
    public void improve(Character ally){
        ally.setGroupStatus(true);
        System.out.println(this.getClass().getPackage().toString() + " " + this.getClass().getSimpleName() +
                " improve him friends " + ally.getClass().getSimpleName());
    }


}
