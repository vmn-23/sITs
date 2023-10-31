package cw.samsung.com;

public class Mage extends Unit {
    private int mana;

    public Mage(String name, int health, int mana) {
        super(name, health);
        if (mana > 0) {
            this.mana = mana;
        } else {
            this.mana = 0;
        }
    }

    public Mage(Mage mage) {
        this(mage.name, mage.health, mage.mana);
    }

    public int giftIsFound() {
        mana += 200;
        return mana;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana : " + mana);
    }
}

