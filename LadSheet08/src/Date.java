public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {}

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }

    public String toString() {
        return month + "-" + day + "-" + year;
    }
}
