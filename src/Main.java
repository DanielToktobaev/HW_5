public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(700);
        boss.setDefendingType("Magic");
        System.out.println("Boss Info: ");
        System.out.printf("Damage: " + boss.getBossDamage() +
                " Health: " + boss.getBossHealth() + " Defending type: " + boss.getDefendingType());

        System.out.println("---------------------");

        Hero[] heroes = createHeroes();
        System.out.println("Heroes info: ");
        for (Hero hero : createHeroes()) {
            System.out.println("Heroes damage: " + hero.getDamage() + " Heroes health: " + hero.getHealth() +
                    " Heroes attack type: " + hero.getSuperPower());
        };

    }
    public static Hero[] createHeroes() {
        Hero magician = new Hero(100, 40, "Magic");
        Hero kinetic = new Hero(80, 30, "Kinetic");
        Hero superman = new Hero (60, 20, "Fly");

        return new Hero[]{magician, kinetic, superman};
    }
}