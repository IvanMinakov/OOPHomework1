public class Main {
    public static void main(String[] args) {
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
    }
}