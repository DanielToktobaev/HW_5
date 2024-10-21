public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String defendingType;

    public int getBossHealth() {return bossHealth;}

    public int getBossDamage() {
        return bossDamage;
    }

    public String getDefendingType() {
        return defendingType;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public void setDefendingType(String defendingType) {
        this.defendingType = defendingType;
    }
}
