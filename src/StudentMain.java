public class StudentMain {
    public static void main(String[] args) {
        Student09 student1 = new Student09();
        student1.studentID = "244107020229";
        student1.name = "Dilo";
        student1.className = "TI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-1I");
        student1.updateGPA(3.9);
        student1.print();

        Student09 student2 = new Student09("244107020040", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();

    }
}
