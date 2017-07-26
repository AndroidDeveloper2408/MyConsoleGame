package model.basic.race.Undeads.MainUndeadsClass;

import model.basic.race.Undeads.UndeadHunter;
import model.basic.race.Undeads.UndeadNecromancer;
import model.basic.race.Undeads.UndeadZombie;

import java.util.Arrays;
import java.util.List;

public class Undeads  {

    private List<UndeadNecromancer>  orcShamans = Arrays.asList(new UndeadNecromancer());
    private List<UndeadHunter>  orcHunters = Arrays.asList(new UndeadHunter(), new UndeadHunter(), new UndeadHunter());
    private List<UndeadZombie> orcGoblins = Arrays.asList(new UndeadZombie(), new UndeadZombie(), new UndeadZombie(), new UndeadZombie());
}
