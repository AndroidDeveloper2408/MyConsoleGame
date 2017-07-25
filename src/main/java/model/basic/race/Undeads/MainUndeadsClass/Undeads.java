package model.basic.race.Undeads.MainUndeadsClass;

import model.basic.characterModel.Character;
import model.basic.race.Elves.ElfHunter;

import java.util.Arrays;
import java.util.List;

public class Undeads extends BasicRace {

    public Undeads(List<? extends Character> mages, List<? extends Character> hunters, List<? extends Character> wars) {
        super(Arrays.asList(new Necromacer()),
                Arrays.asList(new ElfHunter(), new ElfHunter(), new ElfHunter()),
                Arrays.asList( new Zombie(),  new Zombie(),  new Zombie(),   new Zombie()));
    }

    @Override
    public String toString() {
        return "Undeads";
    }
}
