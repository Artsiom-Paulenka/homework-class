public class Main {
    public static void main(String[] args) {
Person firstPerson = new Person();
        firstPerson.age = 18;
        firstPerson.name = "Kate";
        firstPerson.height = 195;
        firstPerson.weight = 67.2;
Person secondPerson = new Person("Artiom", 39, 180, 91);

        System.out.println(firstPerson);
        System.out.println();
        System.out.println(secondPerson);
    }
}
