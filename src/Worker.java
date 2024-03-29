

import java.util.*;

public class Worker extends Person implements AbleToCalculatePension {

    private int minSalary;
    private int maxSalary;

    private Month month;

    private List<Company> company;

    private Set<PensionFund> pensionFundSet;


    public int getMinSalary() {
        return minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }


    public Set<PensionFund> getPensionFundSet() {
        return pensionFundSet;
    }

    public void setPensionFundSet(Set<PensionFund> pensionFundSet) {
        this.pensionFundSet = pensionFundSet;
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


    public void companyOfWorker(List<Company> company) {
        System.out.println("Я работал в следующих компаниях: ");
        for (Company company1 : company) {
            System.out.print(company1);
        }
    }

    @Override
    public double calculatePension() {

        int workExperience = getAge() - 18;
        PensionFund pensionFund = new PensionFund("Bob", "12.12.2022", TypeOfFund.NOTSTATE);
        double minSalaryWorkerWithChildren = minSalary + getChildOfWorker().size() * 200;
        return pensionFund.pensionCalculation(minSalaryWorkerWithChildren, maxSalary, workExperience);

    }

    public double bestPension() {

        int workExperience = getAge() - 18;
        double minSalaryWorkerWithChildren = minSalary + getChildOfWorker().size() * 200;
        double bestResult = 0;
        for (PensionFund fund : pensionFundSet) {
            double countPension = fund.pensionCalculation(minSalaryWorkerWithChildren, maxSalary, workExperience);
            if (countPension > bestResult) {
                bestResult = countPension;
            }
        }
        return bestResult;

    }


}

//public void setNewSalary() {
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

//double number = month.getNumber();
//
//minSalary *= number;
//maxSalary *= number;





