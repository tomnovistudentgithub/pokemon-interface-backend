import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
        setType("water");
    }

    @Override
    public List<String> getAttacks() {
        return Arrays.asList("hydroPump", "surf", "hydroCanon", "rainDance");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with hydroCanon");

        int damage;
        switch (enemy.getType()) {
            case "fire":
                damage = 20;
                break;
            case "electric":
                damage = 10;
                break;
            case "grass":
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


    void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with hydroPump");

        int damage;
        switch (enemy.getType()) {
            case "fire":
                damage = 20;
                break;
            case "electric":
                damage = 10;
                break;
            case "grass":
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


    void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with rainDance");

        if (enemy.getType().equals("electric")) {
            System.out.println("RainDance has no effect on " + enemy.getName());
        } else {
            int damage;
            switch (enemy.getType()) {
                case "fire":
                    damage = 20;
                    break;
                case "grass":
                    damage = -10;
                    break;
                default:
                    damage = 5;
                    break;
            }
            enemy.takeDamage(damage);
            System.out.println(enemy.getName() + " loses " + Math.abs(damage) + " hp");
            System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
        }
    }

    void surf(Pokemon name, Pokemon enemy) {
        System.out.println(this.getName() + " attacks " + enemy.getName() + " with surf");

        if (enemy.getType().equals("electric")) {
            System.out.println("RainDance has no effect on " + enemy.getName());
        } else {
            int damage;
            switch (enemy.getType()) {
                case "fire":
                    damage = 20;
                    break;
                case "grass":
                    damage = -10;
                    break;
                default:
                    damage = 5;
                    break;
            }
            enemy.takeDamage(damage);
            System.out.println(enemy.getName() + " loses " + Math.abs(damage) + " hp");
            System.out.println("Remaining hp of " + enemy.getName() + " is " + enemy.getHp());
        }
    }

    public void attack() {
        System.out.println("Water Pokemon attack!");
    }
}
