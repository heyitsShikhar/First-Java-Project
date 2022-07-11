import java.net.StandardSocketOptions;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health<0||health>100){
            this.health=100;
        } else this.health=health;
        //encapsulation
    }

    //damage by gun 1
    public void damageByGun1() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by Gun1 and health reduced by 30" +" "+ "New health" + this.health);
        if (this.health == 0) {
            System.out.println(getName() + "is Dead");
        }
    }

    public void damageByGun2() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by Gun2 and health reduced by 50" + " "+"New health" + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " is Dead");
        }
    }
public void heal(){
        if(this.health<=0) System.out.println("Player is dead .Heal not possible");
        else {
            this.health=100;
            System.out.println("Healed"+" "+health);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}


