package person;

public abstract class Person {

    private String name;
    private int age;
    private int height;
    private double weight;
    private int money;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void info(int age, String name, int height) {
        System.out.println("The person has " + age + " y.o, " + "his name is " + name + " and" + " his weight is " + height);
    }

    public void goForWork(int age) {
        if (age < 18 || age > 70) {
            System.out.println("I'm resting at home");
        } else {
            System.out.println("I'm work");
        }
    }

    public abstract void die();

}
