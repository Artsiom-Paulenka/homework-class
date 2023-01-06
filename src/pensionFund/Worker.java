package pensionFund;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;

    private int ageOfWork;


    public void setAgeOfWork(int ageOfWork) {
        this.ageOfWork = ageOfWork;
    }

    public void setMinSalary(int minSalary) {
        if (minSalary > 0) {
            this.minSalary = minSalary;
        } else System.err.println("Недопустимое значение");
    }


    public void setMaxSalary(int maxSalary) {
        if (maxSalary > 0) {
            this.maxSalary = maxSalary;
        } else System.err.println("Недопустимое значение");
    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }


    @Override
    public double calculatePension() {

        PensionFund pensionFund = new PensionFund("Bob", "12.12.2022", true);

        return pensionFund.pensionCalculation(minSalary, maxSalary, ageOfWork);

    }

}
