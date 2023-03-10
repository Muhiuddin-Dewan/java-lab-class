public class main {
    public static void main(String[]args) {
        Soldier sol = new Aggresive();
        start(sol);
        testMouse(new GamaingMouse());
    }

    public static void start(Soldier sol){
        sol.play();
    }

    public static void testMouse(Imouse mouse){
        mouse.singleClick();
        mouse.doubleClick();
    }
}
