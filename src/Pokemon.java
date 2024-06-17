import java.util.List;

public abstract class Pokemon {

    private final String name;
    private final int level;
    private final int hp;
    private final String food;
    private final String sound;
    private String type;
    private int damage = 0;

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp - damage;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public abstract List<String> getAttacks();

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void takeDamage(int damage) {
        if (damage < 0) {
            this.damage = Math.max(this.damage + damage, 0);
        } else {
            this.damage += damage;
        }

    }

    void heal(int hp) {
        this.damage = Math.max(this.damage - hp, 0);
    }
}
