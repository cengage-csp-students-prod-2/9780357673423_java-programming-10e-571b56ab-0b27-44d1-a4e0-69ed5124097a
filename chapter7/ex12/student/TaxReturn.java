public class TaxReturn {
    private String social;
    private String fname;
    private String lname;
    private String street;
    private String city;
    private String state;
    private String zip;
    private double income;
    private String marital;
    private double tax;

    // Correct constructor
    public TaxReturn(String social, String fname, String lname, String street, String city, String state, String zip, double income, String marital) {
        this.social = social;
        this.fname = fname;
        this.lname = lname;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.income = income;
        this.marital = marital;

        calculateTax();
    }

    private void calculateTax() {
        char status = Character.toUpperCase(marital.charAt(0)); // S or M
        if (status == 'S') {
            if (income <= 20000)
                tax = income * 0.15;
            else if (income <= 50000)
                tax = income * 0.22;
            else
                tax = income * 0.30;
        } else if (status == 'M') {
            if (income <= 20000)
                tax = income * 0.14;
            else if (income <= 50000)
                tax = income * 0.20;
            else
                tax = income * 0.28;
        } else {
            tax = 0; // Unknown marital status
        }
    }

    public void display() {
        System.out.println("Taxpayer ssn: " + social + " " + fname + " " + lname);
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zip);
        System.out.println("Marital status: " + marital.charAt(0));
        System.out.println("Income: $" + income + "  Tax: $" + tax);
    }
}
