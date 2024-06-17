import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("fire");
    }

    @Override
    public List<String> getAttacks() {
        return Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with fireAttack");

        int damage;
        switch (enemy.getType()) {
            case "grass":
                damage = 20;
                break;
            case "water":
                damage = 10;
                break;
            case "electric":
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


    void pyroBall(Pokemon name, Pokemon enemy) {

    }

    void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with fireLash");

        int damage;
        switch (enemy.getType()) {
            case "grass":
                damage = 20;
                break;
            case "water":
                damage = 10;
                break;
            case "electric":
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

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with inferno");

        int damage;
        switch (enemy.getType()) {
            case "grass":
                damage = 20;
                break;
            case "water":
                damage = 10;
                break;
            case "electric":
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
        System.out.println("Fire Pokemon attack!");
    }
}
