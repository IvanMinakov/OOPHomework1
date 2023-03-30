package org.example;

import java.util.Random;

import org.example.units.Names;

public abstract class BaseHero implements GameInterface {
    int x, y, def;
    int[] dmg;
    float hP, maxHP;
    String name;

    public BaseHero(String name, int x, int y, int def, int[] dmg, float hP) {
        this.name = getName();
        this.x = x;
        this.y = y;
        this.dmg = dmg;
        this.hP = hP;
        this.maxHP = hP;
        this.def = def;

    }

    @Override
    public String getInfo() {
        return "";
    }

    public String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

}
