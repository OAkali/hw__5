public class Boss {
    private int bossHeals;
    private int bossDamage;
    private String bossAttackType;

    public int getBossHeals() {
        return bossHeals;
    }

    public void setBossHeals(int bossHeals) {
        this.bossHeals = bossHeals;
    }
    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossAttackType(String bossAttackType) {
        this.bossAttackType = bossAttackType;
    }

    public String getBossAttackType() {
        return bossAttackType;
    }
}
