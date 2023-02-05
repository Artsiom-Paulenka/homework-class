import java.util.HashMap;
import java.util.Map;

public class Company {

    private String nameOfCompany;

    private Map<String,String> holiday = new HashMap<>();

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public Map<String, String> getHoliday() {
        return holiday;
    }

    public void setHoliday(Map<String, String> holiday) {
        this.holiday = holiday;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public Company(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    @Override
    public String toString() {
        return nameOfCompany;
    }
}
