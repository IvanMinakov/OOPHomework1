package org.example;
import org.example.units.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {

                case 0:
                    heroes.add(new Crossbowman("Златоуст", 6, 8, 70, new int[]{12, 20}, 100));
                    break;
                case 1:
                    heroes.add(new Mage("Демидий", 3, 4, 70, new int[]{12, 20}, 100));
                    break;
                case 2:
                    heroes.add(new Monk("Гореслав", 10, 5, 50, new int[]{8, 16}, 100));
                    break;
                case 3:
                    heroes.add(new Peasant("Мирон", 5, 9, 50, new int[]{3, 7}, 100));
                    break;
                case 4:
                    heroes.add(new Sniper("Одурлей", 6, 8, 68, new int[]{10, 18}, 100));
                    break;
                case 5:
                    heroes.add(new Spearman("Веровер", 7, 2, 70, new int[]{12, 20}, 100));
                    break;
                default:
                    heroes.add(new Thief("Обдурин", 6, 1, 60, new int[]{5, 10}, 100));
                    break;
            }

        }
        heroes.forEach((n)->System.out.println(n.name +" " + n.getInfo()));
    }
}
