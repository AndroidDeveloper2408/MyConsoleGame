package model.basic.race.Humans.MainHumansClass;

import model.basic.characterModel.Character;
import model.basic.race.Elves.ElfMage;
import model.basic.race.Elves.ElfWar;

import java.util.Arrays;
import java.util.List;

public class Humans extends BasicRace {

    public Humans(List<? extends Character> mages, List<? extends Character> hunters, List<? extends Character> wars) {
        super(Arrays.asList(new ElfMage()),
                Arrays.asList(new Arbalester(), new Arbalester(), new Arbalester()),
                Arrays.asList(new ElfWar(), new ElfWar(), new ElfWar(), new ElfWar()));
    }

    @Override
    public String toString() {
        return "Humans";
    }
}
