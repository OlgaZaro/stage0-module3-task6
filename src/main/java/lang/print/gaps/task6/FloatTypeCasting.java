package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        floatTypeCasting.roundNumber(5.5f);

    }
    public void roundNumber(float numberToBeRounded) {
       int round = (int) numberToBeRounded;
       System.out.println(round);
    }
}
