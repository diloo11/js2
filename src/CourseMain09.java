public class CourseMain09 {
    public static void main(String[] args) {
        Course09 course1 = new Course09(null, null, 0, 0);
        course1.courseID = "202232";
        course1.name = "Daspro";
        course1.credit = 3;
        course1.hour = 6;
        course1.print();
        course1.changeCredit(2);
        course1.reduceHour(2);
        course1.print();

        
        Course09 course2 = new Course09("202210", "English", 2, 4);
        course2.print();
        course2.addHour(2);
        course2.print();

    }
}
