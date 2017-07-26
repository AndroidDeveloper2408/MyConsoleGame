package model.basic.race.Humans.MainHumansClass;

import model.basic.race.Humans.HumanArbalester;
import model.basic.race.Humans.HumanMage;
import model.basic.race.Humans.HumanWar;

import java.util.Arrays;
import java.util.List;

public class Humans {

    private List<HumanMage> humanMages = Arrays.asList(new HumanMage());
    private List<HumanArbalester>  humanArbalesters = Arrays.asList(new HumanArbalester(), new HumanArbalester(), new HumanArbalester());
    private List<HumanWar> humanWars = Arrays.asList(new HumanWar(), new HumanWar(), new HumanWar(), new HumanWar());

}
