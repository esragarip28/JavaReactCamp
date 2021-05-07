package abstracts;

public abstract class GameCalculator {
    //whoever inherits this function have to fill in the function.
    public abstract void calculate();

    //whoever use this function ,cannot change by which 'final' keyword.
    public final void gameOver(){
        System.out.println("game over");
    }
    /*
    we can write both abstract methods and normal methods
     */

}
