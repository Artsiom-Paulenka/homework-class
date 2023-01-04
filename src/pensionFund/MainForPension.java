package pensionFund;

public class MainForPension {
    public static void main(String[] args) {

        PensionFund statePension = new PensionFund("Жизнь", "12/12/2022)", true);
        PensionFund notStatePension = new PensionFund("Жизнь", "12/12/2022)", false);

        statePension.pensionСalculation(100, 150, 5);
        notStatePension.pensionСalculation(100, 150, 5);

    }
}


