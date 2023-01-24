import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainForPension {
    public static void main(String[] args) {

        //PensionFund statePension = new PensionFund("Live", "12/12/2022)", TypeOfFund.NOTSTATE);
//        PensionFund notStatePension = new PensionFund("House", "11/11/2022)", false);

        //PensionFund state = new PensionFund("Live", "12/12/12", TypeOfFund.SCAMMERS);

        List<String> listOfChild = List.of("Tom", "Marry", "Katty");

        Worker worker = new Worker();

        worker.setChildOfWorker(listOfChild);

        //worker.setMinSalary(1000);
        worker.setMaxSalary(2300);
        worker.setAge(60);
        double result = worker.calculatePension();

        System.out.println(result);

        Pensioner pensioner = new Pensioner();

        pensioner.setChildOfWorker(listOfChild);
        pensioner.setPension(100);
        pensioner.setAge(60);
        pensioner.die();

    }
}



