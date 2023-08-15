public class Main {
    public static void main(String[] args) {
        Boss bossParameters=new Boss();
        bossParameters.setBossHeals(1000);
        bossParameters.setBossDamage(50);
        bossParameters.setBossAttackType("Physical");
        System.out.println("Heals: "+bossParameters.getBossHeals()+ " Damage: "
                + bossParameters.getBossDamage()+"Attack Type: "+bossParameters.getBossAttackType());

    }

}
