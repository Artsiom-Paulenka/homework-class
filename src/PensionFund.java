
public class PensionFund {
    private static final double PENSION_MULTIPLIER = 0.02;
    private String name;
    boolean state;
    final String date;

    public PensionFund(String name, String date, boolean state) {
        this.name = name;
        this.state = state;
        this.date = date;
    }

    public int pensionСalculation(int minSalary, int maxSalary, int age) {
        if (state) {
            int finish = MiddleNumberUtils.getFirstMiddle(minSalary, maxSalary);
            finish *= PENSION_MULTIPLIER * age;
            System.out.println("При негосударственной аша пенсия" + finish);
            return finish;
        } else {
            int middlePensionInTheCountry = 1500;
            int finish1 = MiddleNumberUtils.getSecondMiddle(minSalary, maxSalary, middlePensionInTheCountry);
            finish1 *= PENSION_MULTIPLIER * age;
            System.out.println("Ваша пенсия" + finish1);
            return finish1;
        }
    }
//public static void pension(){
//        int a = PensionFund.
//}

}


