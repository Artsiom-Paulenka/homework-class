
public class PensionFund {
    private static final double PENSION_MULTIPLIER = 0.02;
    private String name;
    private boolean state;
    final String date;

    public PensionFund(String name, String date, boolean state) {
        this.name = name;
        this.state = state;
        this.date = date;
    }

    public int pensionСalculation(int minSalary, int maxSalary, int ageOfWork) {
        if (state) {
            int summary = MiddleNumberUtils.getFirstMiddle(minSalary, maxSalary);
            summary *= PENSION_MULTIPLIER * ageOfWork;
            System.out.println("При государственном фонде ваша пенсия составит " + summary);
            return summary;
        } else {
            int middlePensionInTheCountry = 1500;
            int summaryOne = MiddleNumberUtils.getSecondMiddle(minSalary, maxSalary, middlePensionInTheCountry);
            summaryOne *= PENSION_MULTIPLIER * ageOfWork;
            System.out.println("При негосударственном фонде ваша пенсия составит " + summaryOne);
            return summaryOne;
        }
    }

}


