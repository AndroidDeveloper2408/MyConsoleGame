package model.basic.race.Elves.MainElvesClass;

import model.basic.race.Elves.ElfHunter;
import model.basic.race.Elves.ElfMage;
import model.basic.race.Elves.ElfWar;

import java.util.Arrays;
import java.util.List;

public class Elves {

    List<ElfMage> elfMages;
    List<ElfHunter> elfHunters;
    List<ElfWar> elfWars;

    public Elves() {
        elfMages = Arrays.asList(new ElfMage());
        elfHunters = Arrays.asList(new ElfHunter(), new ElfHunter(), new ElfHunter());
        elfWars = Arrays.asList(new ElfWar(), new ElfWar(), new ElfWar(), new ElfWar());
    }

    @Override
    public String toString() {
        return "Elves";
    }
}
