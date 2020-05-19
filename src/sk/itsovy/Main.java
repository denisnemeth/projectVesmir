package sk.itsovy;

public class Main {
    public static void main(String[] args) {

        Slnko slnko = Slnko.getInstance();

        slnko.addPlaneta("Merkur");
        slnko.addPlaneta("Venusa");
        slnko.addPlaneta("Zem");
        slnko.addPlaneta("Mars");
        slnko.addPlaneta("Jupiter");
        slnko.addPlaneta("Saturn");
        slnko.addPlaneta("Uran");
        slnko.addPlaneta("Neptun");

        slnko.printPlanety();
    }
}
