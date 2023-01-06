package pensionFund;

public class MainForPerson {
    public static void main(String[] args) {
        Person firstPerson = new Pensioner();

        firstPerson.info(60, "Artiom", 185);
        firstPerson.setName("Bob");
        System.out.println(firstPerson.getName());

        firstPerson.goForWork(50);

        firstPerson.setMoney(500);
        System.out.println(firstPerson.getMoney());


        Person secondPerson = new Worker();
        secondPerson.info(45, "Katty", 150);
        secondPerson.setHeight(179);
        System.out.println(secondPerson.getHeight());


        Pensioner pensioner = new Pensioner();
        Worker worker = new Worker();

        pensioner.setPension(200);
        pensioner.setAgeOfPensioner(67);
        pensioner.die();

        worker.die();

    }
}

