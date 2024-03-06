package robot;

public class Robot {
    private String nom;
    private int pv = 10;

    public Robot(String nomR) {
        this.nom = nomR;
    }

    public String getNom() {
        return nom;
    }

    public int getPv() {
        return pv;
    }


    @Override
    public String toString() {
        return "Robot " + getNom();
    }

    public void fire(robot.Robot cible) {
        cible.pv -= 2;
        System.out.println("Robot " + cible.nom + " a ete touche par le robot " + this.nom + " !");
    }

    public boolean isDead() {
        return pv <= 0;
    }
}


