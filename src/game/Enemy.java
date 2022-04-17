package game;

public class Enemy {
    //Membuat Variabel
    private String name;
    private int hp;
    private int attackPoin;

    //Membuat Method
    public Enemy (String name, int hp, int attackPoin) {
        this.name = name;
        this.hp = hp;
        this.attackPoin = attackPoin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPoin() {
        return attackPoin;
    }

    public void setAttackPoin(int attackPoin) {
        this.attackPoin = attackPoin;
    }

    void attack () {
        System.out.println("Serang!");
    }
}
