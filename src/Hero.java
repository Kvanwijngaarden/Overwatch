public class Hero {
    private String name;
    private String weapon;
    private String type;
    private int HP;
    private int maxHP;
    private int kill;
    private int death;

    public Hero(String name, String weapon, String type, int maxHP) {
        this.name = name;
        this.weapon = weapon;
        this.type = type;
        this.HP = maxHP;
        this.maxHP = maxHP;
        this.kill = 0;
        this.death = 0;
    }

    public String getName() {
        return this.name;
    }

    public void decreaseHp(int HP, Hero attacker) {
        this.HP = this.HP - HP;
        checkIfDead(attacker);
    }

    public void checkIfDead(Hero attacker) {
        if (this.HP <= 0) {
            death += 1;
            attacker.kill += 1;
            String result = (this.name + " died.");
            System.out.println(result);
            this.respawn();
        } else {
            String result = (this.name + " has " + this.HP + " HP.");
            System.out.println(result);
        }
    }

    public void respawn(){
        this.HP = maxHP;
        String result = (this.name + " respawned.");
        System.out.println(result);
    }


    public void kdratio() {
        try {
            double killdeathratio = kill / death;
            String result = (this.name + "'s kill / death ratio is " + killdeathratio + ".");
            System.out.println(result);

        } catch (ArithmeticException divideByZero) {
            divideByZero.printStackTrace();
        }

    }
}