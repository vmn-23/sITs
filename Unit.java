package cw.samsung.com;

public class Unit {
    protected String name;
    protected int health;

    public Unit(String name, int health) {
        if (health > 0 && health <= 100) {
            this.health = health;
        } else {
            this.health = 100;
        }
        this.name = name;
    }

    public Unit(Unit unit) {
        this(unit.name, unit.health);
    }

    public int cure() {
        health++;
        return health;
    }

    public void printInfo() {
        System.out.println("================");
        System.out.println("Name : " + name);
        System.out.println("Health : " + health);
    }
}
