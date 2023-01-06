package pensionFund;

public class Pensioner extends Person {

    private double pension;
    private int ageOfPensioner;


    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public int getAgeOfPensioner() {
        return ageOfPensioner;
    }

    public void setAgeOfPensioner(int ageOfPensioner) {
        this.ageOfPensioner = ageOfPensioner;
    }



    @Override
    public void die() {
        double x = (ageOfPensioner - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал:" + x);
    }
}
