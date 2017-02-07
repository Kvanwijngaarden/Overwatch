public class Hanzo extends Hero {

    public Hanzo(String name) {
        super(name, "bow", "defense", 200);
    }

    public void wallClimb(){
        String result = (super.getName() + " tried to climb the wall, but fell down.");
        System.out.println(result);
    }

    public void scatterArrow(Hero target){
        String result = (super.getName() + " shoots scatter arrow at " + target.getName() + " and missed.");
        System.out.println(result);
    }

    public void sonicArrow(Hero target){
        String result = (super.getName() + " shoots sonic arrow at " + target.getName() + " and missed.");
        System.out.println(result);
    }

    public void dragonStrike(){
        String result = (super.getName() + " yells 'RYUU GA WAGA TEKI WO KURAU!' at the top of his lungs as dramatically as he can, but he still missed everyone, because he's Hanzo. Remember, kids, don't be a Hanzo. Nobody likes a Hanzo.");
        System.out.println(result);
    }

}
