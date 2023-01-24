public class Pensioner extends Person {

    private double pension;
//    private int ageOfPensioner;


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    //В метод die у пенсионера допишите код, который будет писать так:
    // "Зато у меня x детей", где x - размер листа, в котором хранятся дети
    @Override
    public void die() {
        double x = (getAge() - 50) * pension;

        System.out.println("Этот пенсионер умер, он заработал:" + x);
        System.out.println("Зато у меня " + getChildOfWorker().size() + " детей");
    }
}
