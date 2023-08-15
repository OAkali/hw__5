public class Hero {
    private int health;
    private int damage;
    private String heroesAttackType;

    public Hero (int health, int damage, String heroesAttackType){
        this.health=health;
        this.damage=damage;
        this.heroesAttackType=heroesAttackType;

    }
    public Hero(int health,int damage){
        this.health=health;
        this.damage=damage;
    }

    public int getHealth() {
        return health;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public int getDamage() {
        return damage;
    }
   
}
