public class Person {
    String name;
    int age;
    int height;
    double weight;

    public Person(String name, int age, int height, double weight ){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
public Person (){
};
public void info(int age, String name, int height){
    System.out.println("The person has" + age + "y.o, " + "his name is " + name + "and" + "his weight is " + height);
}
public void goForWork(int age){
    if(age < 18 || age > 70){
        System.out.println("I'm resting at home");
    }
    else {
        System.out.println("I'm work");
    }
}





}
