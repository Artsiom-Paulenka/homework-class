package pensionFund;

public class MainForPension {
    public static void main(String[] args) {

        PensionFund statePension = new PensionFund("Live", "12/12/2022)", true);
//        PensionFund notStatePension = new PensionFund("House", "11/11/2022)", false);

        Worker worker = new Worker();

        worker.setMinSalary(200);
        worker.setMaxSalary(1000);
        worker.setAgeOfWork(30);
        double result = worker.calculatePension();

        System.out.print(result);
    }
}



