package robot;

import robot.Robot;

import java.util.Random;

    public class Fighter extends Robot {
        private Random random;

        public Fighter(String nomR,  int seed) {
            super(nomR);
            this.random= new Random(seed);
        }

        @Override
        public void fire(Robot cible){
            if (random.nextBoolean()){
                super.fire(cible);
            }else{
                System.out.println("Le combattant "+getNom() +"a rate sa cible");
            }
        }

        @Override
        public String toString(){
            return "Fighter "+ getNom();
        }
    }




