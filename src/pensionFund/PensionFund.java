package pensionFund;

import java.util.Objects;

public class PensionFund {

    private static final double PENSION_MULTIPLIER = 0.02;
    private String name;
    private boolean isState;
    private String date;
    private static final int MIDDLE_PENSION_IN_THE_COUNTRY = 1500;

    public PensionFund() {

    }

public String getDate(){
        return date;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (isState != that.isState) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isState ? 1 : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", date='" + date + '\'' +
                '}';
    }

    public PensionFund(String name, String date, boolean isState) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }

    public int pensionСalculation(int minSalary, int maxSalary, int ageOfWork) {
        if (isState) {
            int summary = MiddleNumberUtils.getFirstMiddle(minSalary, maxSalary);
            summary *= PENSION_MULTIPLIER * ageOfWork;
            System.out.println("При государственном фонде ваша пенсия составит " + summary);
            return summary;
        } else {
            int summaryOne = MiddleNumberUtils.getSecondMiddle(minSalary, maxSalary, MIDDLE_PENSION_IN_THE_COUNTRY);
            summaryOne *= PENSION_MULTIPLIER * ageOfWork;
            System.out.println("При негосударственном фонде ваша пенсия составит " + summaryOne);
            return summaryOne;
        }
    }

}


