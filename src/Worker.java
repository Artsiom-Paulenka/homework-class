

import java.util.ArrayList;
import java.util.List;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;

    //private int minSalaryWithChildren;

    private int ageOfWork;

    private Month month;


    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }


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

        PensionFund pensionFund = new PensionFund("Bob", "12.12.2022", TypeOfFund.NOTSTATE);

        double minSalaryWorkerWithChildren = getChildOfWorker().size() * 200;

        return pensionFund.pensionCalculation(minSalaryWorkerWithChildren, maxSalary, getAge());

    }

    public void setNewSalary() {
//        Sex sex = getSex();

//        switch (sex) {
//            case MALE:
//                minSalary *= 1.5;
//                maxSalary *= 1.5;
//                break;
//            case FEMALE:
//                minSalary *= 1.6;
//                maxSalary *= 1.6;
//        }
       //if (month.equals(Month.DECEMBER)) {
       //    minSalary *= 10;
       //    maxSalary *= 10;
       //} else if (month.equals(Month.NOVEMBER)) {
       //    minSalary *= 2;
       //    maxSalary *= 2;
       //} else if (month.equals(Month.JANUARY)) {
       //    minSalary *= 1.1;
       //    maxSalary *= 1.1;
       //}
        //switch (month) {
        //    case DECEMBER:
        //        minSalary *= 10;
        //        maxSalary *= 10;
        //        break;
        //    case NOVEMBER:
        //        minSalary *= 2;
        //        maxSalary *= 2;
        //        break;
        //    case JANUARY:
        //        minSalary *= 1.1;
        //        maxSalary *= 1.1;
        //        break;
        //    default:
        //        minSalary *= 0;
        //        maxSalary *= 0;
        //        break;
//
        //}

        double number = month.getNumber();

        minSalary *= number;
        maxSalary *= number;

    }


}
