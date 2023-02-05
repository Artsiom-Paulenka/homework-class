import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Set<PensionFund> fundSet = new HashSet<>();
        //fundSet.add(new PensionFund("Life", "12.12.22", TypeOfFund.STATE));
        //fundSet.add(new PensionFund("Miracle", "13.12.22", TypeOfFund.NOTSTATE));
        //fundSet.add(new PensionFund("Support", "14.12.22", TypeOfFund.SCAMMERS));


        //Worker Petrov = new Worker();
        //List<String> childOfPetrov = new ArrayList<>();
        //childOfPetrov.add("Katya");
        //childOfPetrov.add("Vasilij");
        //childOfPetrov.add("Gena");
        //Petrov.setChildOfWorker(childOfPetrov);
        //Petrov.countOfChild();

        //List<Company> companyOfPetrov = new ArrayList<>();
        //companyOfPetrov.add(new Company("Google"));
        //companyOfPetrov.add(new Company("Microsoft"));
        //Petrov.companyOfWorker(companyOfPetrov);

        //System.out.println();

        //Petrov.setAge(60);
        //Petrov.setMinSalary(1000);
        //Petrov.setMaxSalary(2500);
        //Petrov.setPensionFundSet(fundSet);
        //System.out.println(Petrov.bestPension());


        //Worker Ivanov = new Worker();
        //List<String> childOfIvanov = new ArrayList<>();
        //childOfIvanov.add("Lena");
        //childOfIvanov.add("Petja");
        //childOfIvanov.add("Sasha");
        //Ivanov.setChildOfWorker(childOfIvanov);
//
        //List<Company> companyOfIvanov = new ArrayList<>();
        //companyOfIvanov.add(new Company("MAZ,"));
        //companyOfIvanov.add(new Company("BELAZ"));
        //Ivanov.companyOfWorker(companyOfIvanov);
//
//
//
        //Worker Sidorov = new Worker();
        //List<String> childOfSidorov = new ArrayList<>();
        //childOfSidorov.add("Igor");
        //childOfSidorov.add("Nadegda");
        //childOfSidorov.add("Dima");
        //Sidorov.setChildOfWorker(childOfSidorov);
        //Sidorov.countOfChild();
//

///////////////////////////////////////////////////////////////////////////////


        //Worker Korolev = new Worker();

        //Set<TypeOfFund> pensionFundSetOfKorolev = new HashSet<>();
        //pensionFundSetOfKorolev.add(TypeOfFund.STATE);
        //pensionFundSetOfKorolev.add(TypeOfFund.NOTSTATE);

        //Worker Vasechkin = new Worker();
        //Set<TypeOfFund> pensionFundSetOfVasechkin = new HashSet<>();
        //pensionFundSetOfVasechkin.add(TypeOfFund.STATE);
        //pensionFundSetOfVasechkin.add(TypeOfFund.SCAMMERS);


        //worker.setChildOfWorker(listOfChild);

        ////worker.setMinSalary(1000);
        //worker.setMaxSalary(2300);
        //worker.setAge(60);
        //double result = worker.calculatePension();

        //System.out.println(result);

        //Pensioner pensioner = new Pensioner();

        //pensioner.setChildOfWorker(listOfChild);
        //pensioner.setPension(100);
        //pensioner.setAge(60);
        //pensioner.die();

        ///////////////////////////////////////////////////

        Map<String, String> holidaysOfGoogleCompany = new HashMap<>();
        holidaysOfGoogleCompany.put("Valentin's Day", "14 февраля");
        holidaysOfGoogleCompany.put("Рождество Христово", "7 января");
        holidaysOfGoogleCompany.put("Международный женский день", "8 марта");

        Map<String, String> holidaysOfMicrosoftCompany = new HashMap<>();
        holidaysOfMicrosoftCompany.put("Праздник Весны и Труда", "1 мая");
        holidaysOfMicrosoftCompany.put("Всемирный день китов", "19 февраля");
        holidaysOfMicrosoftCompany.put("Всемирный день астрологии", "20 марта");

        Company google = new Company("Google");
        Company microsoft = new Company("Microsoft");

        google.setHoliday(holidaysOfGoogleCompany);
        microsoft.setHoliday(holidaysOfMicrosoftCompany);

        System.out.println(google.getHoliday());
        System.out.println(microsoft.getHoliday());


    }


}



