public class Automobile {
    private int id;
    private String make;
    private String model;
    private String color;
    private int year;
    private double mpg;

    // Default constructor
    public Automobile() {
        setId(0);
        setYear(0);
        setMiles(0);
        setMake("");
        setModel("");
        setColor("");
    }

    // Overloaded constructor
    public Automobile(int id, int year, double miles, String make, String model, String color) {
        setId(id);
        setYear(year);
        setMiles(miles);
        setMake(make);
        setModel(model);
        setColor(color);
    }

    public void setId(int id) {
        if (id < 0 || id > 9999) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        if (year < 2005 || year > 2024) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public void setMiles(double mpg) {
        if (mpg < 10 || mpg > 60) {
            this.mpg = 0;
        } else {
            this.mpg = mpg;
        }
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getMiles() {
        return mpg;
    }
}
