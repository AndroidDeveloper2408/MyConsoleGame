package model.basic.race.Orcs.MainOrcsClass;

import model.basic.race.Orcs.OrcGoblin;
import model.basic.race.Orcs.OrcHunter;
import model.basic.race.Orcs.OrcShaman;

import java.util.Arrays;
import java.util.List;

public class Orcs {

    private List<OrcShaman>  orcShamans = Arrays.asList(new OrcShaman());
    private List<OrcHunter>  orcHunters = Arrays.asList(new OrcHunter(), new OrcHunter(), new OrcHunter());
    private List<OrcGoblin> orcGoblins = Arrays.asList(new OrcGoblin(), new OrcGoblin(), new OrcGoblin(), new OrcGoblin());

}
