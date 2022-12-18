public class MiddleNumberUtils {
    public static int getFirstMiddle(int numberOne, int numberTwo){
int middleFirstNumber = (numberOne + numberTwo) / 2;
return middleFirstNumber;
    }

    public static int getSecondMiddle(int numberOne, int numberTwo, int numberThree){
        int middleSecondNumber = (numberOne + numberTwo + numberThree) / 2;
        return middleSecondNumber;
    }
}
