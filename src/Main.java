public class Main {
    public static void main(String args[]) {
        Hanzo hanzomain = new Hanzo("Rick");
        Junkrat junkrat = new Junkrat("Martijn");
        Genji genji = new Genji("Kjeld");


        hanzomain.wallClimb();
        hanzomain.scatterArrow(junkrat);
        hanzomain.dragonStrike();
        hanzomain.kdratio();

        genji.dragonBlade(junkrat);

        junkrat.steelTrap(hanzomain);
        junkrat.ripTire(hanzomain);
        junkrat.ripTire(genji);

        junkrat.kdratio();
        genji.kdratio();
        hanzomain.kdratio();

    }
}
