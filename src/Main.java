class Archer {
    private int accuracy = 85;
    private int attackSpeed = 10;
    private int damage = 20;
    private int attackRange = 4;

    public void shoot() {
    }
}

class Crossbowman {
    private int accuracy = 75;
    private int attackSpeed = 8;
    private int damage = 30;
    private int attackRange = 3;

    public void shoot() {
    }

}

class Thief {
    private int armor = 20;
    private int damage = 15;
    private int speed = 12;
    private int attackRange = 1;

    public void steal() {
    }
}

class Halberdier {
    private int armor = 30;
    private int damage = 25;
    private int speed = 6;
    private int attackRange = 2;

    public void attack() {
    }
}

class Peasant {
    private int arrowCount;

    public void bringArrows(int count) {
    }
}

class Mage {
    private int armor = 10;
    private int damage = 35;
    private int speed = 4; // cells per minute
    private int attackRange = 3; // cells

    public void castSpell() {
    }

    class Monk {
        private int armor = 40;
        private int damage = 20;
        private int speed = 5;
        private int attackRange = 1;

        public void heal() {
        }

        class Spearman {
            private int armor = 20;
            private int damage = 30;
            private int speed = 7;
            private int attackRange = 1;

            public void thrust() {
            }
        }

    }
}
interface Character {
    void step();
    String getInfo();
}

 abstract class BaseHero implements Character {
    protected String name;
    protected int health;

    public BaseHero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

 class Warrior extends BaseHero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void step() {
        // персонаж делает шаг
    }

    @Override
    public String getInfo() {
        return "Warrior";
    }
}

 class Mage extends BaseHero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void step() {
        // персонаж делает шаг
    }

    @Override
    public String getInfo() {
        return "Mage";
    }
}

 class Rogue extends BaseHero {
    public Rogue(String name, int health) {
        super(name, health);
    }

    @Override
    public void step() {
        // персонаж делает шаг
    }

    @Override
    public String getInfo() {
        return "Rogue";
    }
}
public class Archer extends BaseHero {
    private int accuracy = 85;
    private int damage = 20;
    private int speed = 10; // cells per minute
    private int attackRange = 4; // cells
    public Archer(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Archer";
    }
}

public class Crossbowman extends BaseHero {
    private int accuracy = 75;
    private int damage = 30;
    private int speed = 8; // cells per minute
    private int attackRange = 3; // cells
    public Crossbowman(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
}

public class Thief extends BaseHero {
    private int armor = 10;
    private int damage = 15;
    private int speed = 12; // cells per minute
    private int attackRange = 1; // cell
    public Thief(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Thief";
    }
}

public class Halberdier extends BaseHero {
    private int armor = 30;
    private int damage = 25;
    private int speed = 6; // cells per minute
    private int attackRange = 2; // cells
    public Halberdier(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Halberdier";
    }
}

public class Mage extends BaseHero {
    private int accuracy = 90;
    private int damage = 35;
    private int speed = 7; // cells per minute
    private int attackRange = 5; // cells
    public Mage(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Mage";
    }
}

public class Monk extends BaseHero {
    private int armor = 20;
    private int damage = 10;
    private int speed = 9; // cells per minute
    private int attackRange = 1; // cell
    public Monk(String name, int level) {
        super(name, level);
    }

    @Override
    public void step() {
        // perform stepping action
    }

    @Override
    public String getInfo() {
        return "Monk";
    }
}