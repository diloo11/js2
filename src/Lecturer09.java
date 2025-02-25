public class Lecturer09 {
    String lectureID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;
    
    void print(){
        System.out.println("Lecturer ID     : " + lectureID);
        System.out.println("Lecturer Name   : " + name);
        System.out.println("Year Start      : " + startYear);
        System.out.println("Expertise       : " + expertiseField);
        System.out.println();
    }

    void setStatus(boolean status) {
        this.status = status;
        if (status= true) {
            System.out.println("This lecture is Active");
        } else {
            System.out.println("This Lecture is Diactive");
        }
    }

    void calculateTenure(int yearNow) {
        yearNow -= startYear;
        System.out.println("Years of Service: " + yearNow);
    }

    void changeExpertiseField(String newField) {
        expertiseField = newField;
    }

    public Lecturer09(String lectureID, String name, int startYear, String expertiseField) {
        this.lectureID = lectureID;
        this.name = name;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }
}
