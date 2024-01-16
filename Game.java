package game;
import java.util.Scanner;
public class Game {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Player gw = new Player();
        Player lu = new Player();
        
        gw.name = scanner.next();
        gw.speed = 100;
        gw.healthPoin = 100;
        gw.damage = 15;
        gw.defend = 5;
        
        lu.name = scanner.next();
        lu.speed = 100;
        lu.healthPoin = 100;
        lu.damage = 15;
        lu.defend = 5;
        
        int gwsp = 0;
        int lusp = 0;
        
        while(gw.healthPoin!=0 || lu.healthPoin!=0){
            System.out.println("============================");
            System.out.println(gw.name+" turn");
            boolean gwturn = true;
            while(gwturn = true){
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Skill");
            System.out.println("4. Heal");
            
            int gwpil = scanner.nextInt();
            
            if(gwpil==1){
                lu.healthPoin = gw.attack(lu.name, lu.healthPoin, gw.name, lu.defend);
                if(lu.healthPoin==0){
                    System.out.println(gw.name+" is the winner");
                    break;
                }
                gwsp++;
                gwturn = false;
            }
            else if(gwpil==2){
                gw.defend();
                gwsp++;
                gwturn = false;
            }
            else if(gwpil==3){
                if (gwsp==0) {
                    System.out.println("Insufficent SP"); 
                }
                lu.healthPoin = gw.skill(lu.name, lu.healthPoin, gw.name, lu.defend);
                if(lu.healthPoin==0){
                    System.out.println(gw.name+" is the winner");
                    break;
                }
                gwsp--;
                gwturn = false;
            }
            else if(gwpil==4){
                if (gwsp==0) {
                    System.out.println("Insufficent SP"); 
                }
                gw.healthPoin = gw.heal(gw.healthPoin, gw.name);
                gwturn = false;
                gwsp--;
            }
            }
            
            System.out.println(lu.name+" turn");
            gwturn = true;
            System.out.println(lu.name+" turn");
            while(gwturn = true){
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            System.out.println("3. Skill");
            System.out.println("4. Heal");
            int gwpil = scanner.nextInt();
            
            if(gwpil==1){
                gw.healthPoin = lu.attack(gw.name, gw.healthPoin, lu.name, gw.defend);
                if(gw.healthPoin==0){
                    System.out.println(lu.name+" is the winner");
                    break;
                }
                gwsp++;
                gwturn = false;
            }
            else if(gwpil==2){
                lu.defend();
                gwsp++;
                gwturn = false;
            }
            else if(gwpil==3){
                if (gwsp==0) {
                    System.out.println("Insufficent SP"); 
                }
                gw.healthPoin = lu.skill(gw.name, gw.healthPoin, lu.name, gw.defend);
                if(lu.healthPoin==0){
                    System.out.println(lu.name+" is the winner");
                    break;
                }
                gwturn = false;
                gwsp--;
            }
            else if(gwpil==4){
                if (gwsp==0) {
                    System.out.println("Insufficent SP"); 
                }
                lu.healthPoin = lu.heal(lu.healthPoin, lu.name);
                gwturn = false;
                gwsp--;
            }
        }
        
    }
    
}
}
