package person;

public class MainForPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();


        firstPerson.info(20, "Artiom", 185);
        secondPerson.info(35, "Katty", 190);
        firstPerson.setName("Bob");
        firstPerson.goForWork(16);
        firstPerson.setMoney(500);

        System.out.println(firstPerson.getName());
        System.out.println(secondPerson.getHeight());
        System.out.println(firstPerson.getMoney());
    }
}

