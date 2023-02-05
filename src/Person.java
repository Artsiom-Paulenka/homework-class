import java.util.*;

public abstract class Person implements Comparable<Person>  {



    private String name;
    private int age;
    private int height;
    private double weight;
    private int money;

    private Sex sex;

    private Month month;

    private List<String> childOfWorker;


    public List<String> getChildOfWorker() {
        return childOfWorker;
    }

    public void setChildOfWorker(List<String> childOfWorker) {
        this.childOfWorker = childOfWorker;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (height != person.height) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + height;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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

    public void countOfChild() {
        int numberOfChild = getChildOfWorker().size();
        System.out.println("У меня " + numberOfChild + " детей: ");
        int counter = 0;
        for (String s : childOfWorker) {
            counter++;
            System.out.println(counter + ") " + s);

        }
    }
    @Override
    public int compareTo(Person o) {
        if(name.length() > o.getName().length()){
            return 1;
        }
        if(name.length() < o.getName().length()){
            return -1;
        }
        else if (name.length() == o.getName().length()){
            if((age > o.getAge())){
                return 1;
            }else if((age < o.getAge())){
                return -1;
            }
        }
        return 0;
    }

}
