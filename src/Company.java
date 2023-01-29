public class Company {

    private String nameOfCompany;

    public String getNameOfCompany() {
        return nameOfCompany;
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
