public class Date {

    //instance variables
    private int day; // [1,31];
    private int month; // [1,12];
    private int year; // [1900-9999];
    //No validation needed is indicated in assignment

    public Date (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getter methods
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    //setter methods
    public void setDay (int day) {
        this.day = day;
    };
    public void setMonth (int month) {
        this.month = month;
    }
    public void setYear (int year) {
        this.year = year;
    }

    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //format methods
    public String toString () {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
