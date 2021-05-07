package abstracts;

public class Main {
    public static void main(String[] args) {

        /*
        we cannot write that  GameCalculator gameCalculator=new GameCalculator();
        base hold references for subclasses which extend our abstract class
         */
        GameCalculator gameCalculator=new WomanCalculator();
        gameCalculator.calculate();
    }


}
