import java.util.*;

public class MainForPension {
    public static void main(String[] args) {

        Worker Petrov = new Worker();
        List<String> childOfPetrov = new ArrayList<>();
        childOfPetrov.add("Katya");
        childOfPetrov.add("Vasilij");
        childOfPetrov.add("Gena");
        Petrov.setChildOfWorker(childOfPetrov);

        Worker Ivanov = new Worker();
        List<String> childOfIvanov = new ArrayList<>();
        childOfIvanov.add("Lena");
        childOfIvanov.add("Petja");
        childOfIvanov.add("Sasha");
        Petrov.setChildOfWorker(childOfIvanov);

        Worker Sidorov = new Worker();
        List<String> childOfSidorov = new ArrayList<>();
        childOfSidorov.add("Igor");
        childOfSidorov.add("Nadegda");
        childOfSidorov.add("Dima");
        Petrov.setChildOfWorker(childOfSidorov);
        Petrov.countOfChild();

        List<Company> companyOfPetrov = new ArrayList<>();
        companyOfPetrov.add(new Company("Google"));
        companyOfPetrov.add(new Company("Microsoft"));

        List<Company> companyOfIvanov = new ArrayList<>();
        companyOfIvanov.add(new Company("MAZ,"));
        companyOfIvanov.add(new Company("BELAZ"));


        Petrov.companyOfWorker(companyOfIvanov);




        //worker.setChildOfWorker(listOfChild);
//
        ////worker.setMinSalary(1000);
        //worker.setMaxSalary(2300);
        //worker.setAge(60);
        //double result = worker.calculatePension();
//
        //System.out.println(result);
//
        //Pensioner pensioner = new Pensioner();
//
        //pensioner.setChildOfWorker(listOfChild);
        //pensioner.setPension(100);
        //pensioner.setAge(60);
        //pensioner.die();

    }
}



