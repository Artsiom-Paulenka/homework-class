public class MainForPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.age = 18;
        firstPerson.name = "Kate";
        firstPerson.height = 195;
        firstPerson.weight = 67.2;

        Person secondPerson = new Person("Artiom", 39, 180, 91);
        firstPerson.info(20, "Artiom", 185);
        secondPerson.info(35, "Katty", 190);

        System.out.println(firstPerson.name);
        System.out.println(secondPerson.height);

        firstPerson.goForWork(16);

        System.out.println(firstPerson.getMoney(800));
    }
}

