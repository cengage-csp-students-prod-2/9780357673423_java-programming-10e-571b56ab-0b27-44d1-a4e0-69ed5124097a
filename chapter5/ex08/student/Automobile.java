public class Automobile{
public Automobile(int id, int year, double miles, String make, String model, String color){
        setId(id);
        setYear(year);
        setMiles(miles);
        setMake(make);
        setModel(model);
        setColor(color);
}

public void setId(int id){
    final int Max_Id = 9999;
    if (id < 0 || id > 9999){
        this.id  = 0;
    }
    else{
        this.id = id; 
    }
}

public void setMake(String make){
    this.make = make;
}

public void setYear(int year){
    if( year < 2004 || year > 2024){
        this.year = 0;
    }
    else{
        this.year = year;
    }
}

public void setMiles(double miles){
    if (miles < 10 || miles > 60){
        this.miles = 0;
    }
    else{
        this.miles = miles;
    }
}

public void setModel(String model){
    this.model = model;
}

public void setColor(String color){
    this.model = model;
}

public int getId(){
    return id;
}
public double getMiles(){
    return Miles;
}
public int getYear(){
    return Year;
}
public String getColor(){
    return Color;
}
public String getModel(){
    return Model;
}
public String getMake(){
    return Make;
}
}