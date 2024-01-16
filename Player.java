package game;

public class Player {
    
    String name;
    int speed, healthPoin, damage, defend;
    boolean defending = false;
    
    int attack(String a, int b, String c, int defend){
        System.out.println(name +" is attacking "+a);
        System.out.println("Damage: "+damage);
        if (defending=true) {
            damage -= defend;
            System.out.println(a+" reducing the damage by "+defend);
            defending = false;
        }
        b -= damage;
        System.out.println("Kosyi healthpoint: "+b);
        if (b==0) {
            System.out.println(c+" Is the winner");
        }
        return b;
    }
    
    void defend(){
        System.out.println(name +" is defending...");
        System.out.println("Defend: "+defend);
        defending = true;
    }
    
    int skill(String a, int b, String c, int defend){
        System.out.println(name +" is using a skill on "+a);
        System.out.println("Damage: "+damage*2);
        if (defending=true) {
            damage -= defend;
            System.out.println("Kosyi reducing the damage by "+defend);
            defending = false;
        }
        b -= damage*2;
        System.out.println("Kosyi healthpoint: "+b);
        return b;
    }
    
    int heal(int a, String b){
        System.out.println(b+" is healing");
        a += 10;
        if (a>100) {
            a=100;
        }
        return a;
    }

    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
}
