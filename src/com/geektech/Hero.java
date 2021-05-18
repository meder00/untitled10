package com.geektech;

public abstract class Hero implements HavingSuperAbility {


    private int health;
    private int damace;
    private String superDamace;



    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamace() {
        return damace;
    }

    public void setDamace(int damace) {
        this.damace = damace;
    }

    public String getSuperDamace() {
        return superDamace;
    }

    public void setSuperDamace(String superDamace) {
        this.superDamace = superDamace;
    }
}




