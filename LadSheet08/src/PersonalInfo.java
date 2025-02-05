public class PersonalInfo {
    private Person name;
    private Date bDay;
    private int personID;

    public PersonalInfo() {}

    public PersonalInfo(String first, String last, int month, int day, int year, int ID) {
        this.name = new Person(first, last);
        this.bDay = new Date(month, day, year);
        this.personID = ID;
    }

    public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
        this.name.setName(first, last);
        this.bDay.setDate(month, day, year);
        this.personID = ID;
    }

    public String toString() {
        return "Name: " + name + "\nDate of birth: " + bDay + "\nPersonal ID: " + personID;
    }
}
