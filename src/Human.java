public class Human {

    public static final int MAX_RUN_DISTANCE = 5;
    public static final int MAX_JUMP_HEIGHT = 2;


    protected void runHuman() {
        System.out.println("Человек умеет бегать");
    }

    protected void jumpHuman() {
        System.out.println("Человек умеет прыгать");
    }

    protected void wallExam(int height) {
        if (MAX_JUMP_HEIGHT < height) {
            System.out.println("Человек не перепрыгнул через препятствие");
        }
    }


    
}
