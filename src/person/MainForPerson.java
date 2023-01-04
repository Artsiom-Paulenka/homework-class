package person;

public class MainForPerson {
    public static void main(String[] args) {
        Person pensioner = new Pensioner();
        Person worker = new Worker();


        pensioner.info(60, "Artiom", 185);
        worker.info(45, "Katty", 150);
        pensioner.setName("Bob");
        worker.setHeight(179);
        pensioner.goForWork(50);
        pensioner.setMoney(500);




        System.out.println(pensioner.getName());
        System.out.println(worker.getHeight());
        System.out.println(pensioner.getMoney());
    }
}

