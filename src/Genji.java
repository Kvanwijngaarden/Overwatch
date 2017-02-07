public class Genji extends Hero{
    public Genji(String name) {
        super(name, "shuriken", "offense", 200);
    }

    public void deflect(){
        String result = (super.getName() + " deflects all incoming damage.");
        System.out.println(result);
    }

    public void wallClimb(){
        String result = (super.getName() + " climbs the wall.");
        System.out.println(result);
    }

    public void swiftStrike(Hero target){
        String result = (super.getName() + " darts forward and slashes " + target.getName() + ".");
        System.out.println(result);
        target.decreaseHp(50, this);
    }

    public void dragonBlade(Hero target){
        String result = ("The dragon becomes " + super.getName() + " and hits " + target.getName() + ".");
        System.out.println(result);
        target.decreaseHp(360, this);
    }
}
