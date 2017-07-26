package model.basic.race.Elves.MainElvesClass;

import model.basic.race.Elves.ElfHunter;
import model.basic.race.Elves.ElfMage;
import model.basic.race.Elves.ElfWar;

import java.util.Arrays;
import java.util.List;

public class Elves {

    private List<ElfMage> elfMages = Arrays.asList(new ElfMage());
    private List<ElfHunter>  elfHunters = Arrays.asList(new ElfHunter(), new ElfHunter(), new ElfHunter());
    private List<ElfWar> elfWars = Arrays.asList(new ElfWar(), new ElfWar(), new ElfWar(), new ElfWar());

}
