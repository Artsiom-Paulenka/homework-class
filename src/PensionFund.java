import java.util.Objects;

public class PensionFund {

    private static final double PENSION_MULTIPLIER = 0.02;
    private String name;

    //private boolean isState;
    private String date;
    private static final int MIDDLE_PENSION_IN_THE_COUNTRY = 1500;

    private TypeOfFund typeOfFund;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(date, that.date)) return false;
        return typeOfFund == that.typeOfFund;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (typeOfFund != null ? typeOfFund.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", typeOfFund=" + typeOfFund +
                '}';
    }

    public PensionFund(String name, String date, TypeOfFund typeOfFund) {
        this.name = name;
        this.date = date;
        this.typeOfFund = typeOfFund;
    }

    public double pensionCalculation(double minSalary, double maxSalary, int ageOfWork) {
        switch (typeOfFund) {
            case STATE:
                double summary = MiddleNumberUtils.getMiddle(minSalary, maxSalary);
                summary *= PENSION_MULTIPLIER * ageOfWork;
                return summary;

            case NOTSTATE:
                double summaryOne = MiddleNumberUtils.getMiddle(minSalary, maxSalary, MIDDLE_PENSION_IN_THE_COUNTRY);
                summaryOne *= PENSION_MULTIPLIER * ageOfWork;
                return summaryOne;

            case SCAMMERS:
                return 0;
        }

        return 0;
    }

}


