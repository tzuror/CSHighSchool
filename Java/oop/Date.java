package Java.oop;

public class Date {

    private int day, month, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public void setYear(int yearToSet){
        this.year = yearToSet;
    }
    public void setMonth(int monthToSet){
        this.month = monthToSet;
    }
    public void setDay(int dayToSet){
        this.day = dayToSet;
    }
    public int compareTo(Date dateToCompare){
        int DiffrentOfyear = this.year - dateToCompare.year;
        int DiffrentOfmonth = this.month - dateToCompare.month;
        int DiffrentOfday = this.day - dateToCompare.day;
        int DiffrentOfdate = DiffrentOfyear*12*31 + DiffrentOfmonth*31 + DiffrentOfday;
        return DiffrentOfdate;
    }
    public String toString(){
        return this.day + "." + this.month + "." + this.year + ".";
    }
    
}
