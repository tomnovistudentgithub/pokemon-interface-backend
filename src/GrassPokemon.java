import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("grass");
    }

    @Override
    public List<String> getAttacks() {
        return Arrays.asList("leechSeed", "leaveBlade", "leafStorm", "solarBeam");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with leechSeed");
        int damage = 10;
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        this.heal(damage);
        System.out.println(this.getName() + " gains " + damage + " hp");
        System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
        System.out.println("Remaining hp of " + this.getName() + " is " + this.getHp());

    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with leaveBlade");

        int damage;
        switch (enemy.getType()) {
            case "electric":
                damage = 20;
                break;
            case "fire":
                damage = 10;
                break;
            case "water":
                damage = 15;
                break;
            default:
                damage = 5;
                break;
        }
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with leafStorm");

        int damage;
        switch (enemy.getType()) {
            case "electric":
                damage = 20;
                break;
            case "fire":
                damage = 10;
                break;
            case "water":
                damage = 15;
                break;
            default:
                damage = 5;
                break;
        }
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with solarBeam");

        int damage;
        switch (enemy.getType()) {
            case "electric":
                damage = 20;
                break;
            case "fire":
                damage = 10;
                break;
            case "water":
                damage = 15;
                break;
            default:
                damage = 5;
                break;
        }
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());

    }

    public void attack() {
        System.out.println("Grass Pokemon attack!");
    }
}
