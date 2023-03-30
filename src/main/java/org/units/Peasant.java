package org.example.units;

import org.example.BaseHero;

public class Peasant extends BaseHero {
    int quoinArrows, maxQuoinArrows, quoinBolts, maxQuoinBolts;

    float backAmmo;

    public Peasant(String name, int x, int y, int atk, int[] dmg, float hP) {
        super(name, x, y, atk, dmg, hP);
        quoinArrows = maxQuoinArrows = quoinBolts = maxQuoinBolts = 10;
        backAmmo = 1.01F;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }
}