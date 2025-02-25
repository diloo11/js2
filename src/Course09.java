public class Course09 {
    String courseID;
    String name;
    int credit;
    int hour;

    void print() {
        System.out.println("Course ID       :" + courseID);
        System.out.println("Course Name     :" + name);
        System.out.println("SKS             :" + credit );
        System.out.println("Hour/Weekly     :" + hour);
        System.out.println();
    }

    void changeCredit(int newCredit) {
        credit = newCredit;
        System.out.println("New SKS is      : " +credit);
        System.out.println();
    }

    void addHour(int hour) {
        this.hour += hour;
    }

    void reduceHour(int hour) {
        if (hour <= this.hour) {
            this.hour -= hour;
        } 
    }

    public Course09(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }
}
