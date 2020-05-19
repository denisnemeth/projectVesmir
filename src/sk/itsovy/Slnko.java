package sk.itsovy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Slnko {

    private static Slnko instance = new Slnko();
    List<Planeta> planety = new ArrayList<Planeta>();

    private Slnko() {}

    public static Slnko getInstance() { return instance; }

    public void addPlaneta(String name) {
        Planeta planeta = new Planeta(name);
        planety.add(planeta);
    }

    public void printPlanety() {
        int pos = 0;
        while (pos < planety.size()) {
            System.out.print(planety.get(pos).getName() + "  ");
            pos++;
        }
    }
}
