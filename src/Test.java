import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Human human = new Human();
        Сat cat = new Сat();
        Robot robot = new Robot();
        Wall wall = new Wall();

        cat.runCat();
        human.runHuman();
        robot.runRobot();

        cat.jumpCat();
        human.jumpHuman();
        robot.jumpRobot();

       

    }
}
