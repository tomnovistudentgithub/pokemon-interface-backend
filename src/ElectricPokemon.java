import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("electric");
    }

    @Override
    public List<String> getAttacks() {
        return Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    }


    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with electroBall");

        int damage;
        switch (enemy.getType()) {
            case "water":
                damage = 20;
                break;
            case "grass":
                damage = 10;
                break;
            case "fire":
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

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with thunderbolt");

        int damage;
        switch (enemy.getType()) {
            case "water":
                damage = 20;
                break;
            case "grass":
                damage = 10;
                break;
            case "fire":
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

    void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with thunder");

        int damage;
        switch (enemy.getType()) {
            case "water":
                damage = 20;
                break;
            case "grass":
                damage = 10;
                break;
            case "fire":
                damage = 15;
                break;
            case "electric":
                damage = -10;
                break;
            default:
                damage = 5;
                break;
        }
        enemy.takeDamage(damage);
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
    }

    void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with voltTackle");

        int damage;
        switch (enemy.getType()) {
            case "water":
                damage = 20;
                break;
            case "grass":
                damage = 10;
                break;
            case "fire":
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
        System.out.println("Electric Pokemon attack!");
    }
}
