public class Junkrat extends Hero {

    public Junkrat(String name) {
        super(name, "fraglauncher", "defense", 200);
    }

    public void fragLauncher(Hero target){
        String result = (super.getName() + " launches a grenade and hits " + target.getName() + ".");
        System.out.println(result);
        target.decreaseHp(120, this);
    }

    public void concussionMine(Hero target){
        String result =(super.getName() + " detonates his mine and hits " + target.getName() + ".");
        System.out.println(result);
        target.decreaseHp(120, this);
    }

    public void steelTrap(Hero target) {
        String result =(super.getName() + "'s steel trap traps " + target.getName() + ". " + target.getName() + " is triggered.");
        System.out.println(result);
        target.decreaseHp(80, this);
    }

    public void ripTire(Hero target){
        String result = (super.getName() + "'s RIP-Tire explodes next to " + target.getName() + ".");
        System.out.println(result);
        target.decreaseHp(600, this);
    }

}