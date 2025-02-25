public class LecturerMain09 {
    public static void main(String[] args) {
        Lecturer09 lecturer1 = new Lecturer09("2300451", "Dil-Awar Harun El Rashid", 2005, "Cyber Security");
        lecturer1.print();
        lecturer1.setStatus(true);
        lecturer1.calculateTenure(2025);
        lecturer1.changeExpertiseField("Blockchain");
        lecturer1.print();

    }
}
