package robot;

public class Main {

    public static void main(String[] args) {
        Robot bob=new Robot("bob");
        Robot ryu=new Robot("Ryu");
        Fighter bobe=new Fighter("bob",123);
        Fighter bobi=new Fighter("bobi",111);
        bob.toString();
        ryu.toString();

        Robot winner= Arena.fight(bob,ryu);
        System.out.println("le Vainqueur du combat est "+ winner.getNom());
    }
}
