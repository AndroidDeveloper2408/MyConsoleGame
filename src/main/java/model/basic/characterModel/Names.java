package model.basic.characterModel;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Names {

    private List<String> names;
    final Random random = new Random();

    public Names() {
        names = Arrays.asList("Efiopec","Petya", "Murzik", "Vedro", "Danila", "Backlazhan");
    }

    public String getName(){
        return names.get(random.nextInt(6));
    }
}
