public class Сat {

    public static final int MAX_RUN_DISTANCE = 2;
    private int MAX_JUMP_HEIGHT = 4;

    protected void runCat(){
        System.out.println(" Кот умеет бегать");
    }

    protected void jumpCat(){
        System.out.println("Кот умеет прыгать");
    }


    protected void wallExam(int height, int MAX_JUMP_HEIGHT) {
        if (MAX_JUMP_HEIGHT > height) {
            System.out.println("Человек справился с препятствием");
        }
        System.out.println("У человука перепрыгнуть не получилось");
    }
}
