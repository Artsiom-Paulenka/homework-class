public class MainForPension {
    public static void main(String[] args) {

        //PensionFund statePension = new PensionFund("Live", "12/12/2022)", TypeOfFund.NOTSTATE);
//        PensionFund notStatePension = new PensionFund("House", "11/11/2022)", false);

        //PensionFund state = new PensionFund("Live", "12/12/12", TypeOfFund.SCAMMERS);

        Worker worker = new Worker();

        worker.setMinSalary(1000);
        worker.setMaxSalary(2300);
        worker.setAge(45);
        double result = worker.calculatePension();

        System.out.println(result);
    }
}



