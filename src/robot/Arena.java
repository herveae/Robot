
package robot;
    public class Arena {
        public static Robot fight(Robot robot1, Robot robot2){
            while (!robot1.isDead() && !robot2.isDead()){
                robot1.fire(robot2);
                if (!robot2.isDead()){
                    robot2.fire(robot1);
                }

            }
            if(robot1.isDead()){
                return robot2;
            }else{
                return robot1;
            }
        }
    }

