package model.basic.race.Orcs.MainOrcsClass;

import model.basic.characterModel.Character;
import model.basic.race.Elves.ElfHunter;

import java.util.Arrays;
import java.util.List;

public class Orcs extends BasicRace {

    public Orcs(List<? extends Character> mages, List<? extends Character> hunters, List<? extends Character> wars) {
        super(Arrays.asList(new Shaman()),
                Arrays.asList(new ElfHunter(), new ElfHunter(), new ElfHunter()),
                Arrays.asList(new Goblin(), new Goblin(), new Goblin(),  new Goblin()));
    }

    @Override
    public String toString() {
        return "Orcs";
    }
}
