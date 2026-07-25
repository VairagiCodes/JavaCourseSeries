class Student {
    int rollNo;
    String studentName;
}
public class DataTypesInJava {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 20;
        s1.studentName = "Radha";

        Student s2 = new Student();

        s2 = s1;

        Student s3 = new Student();
        s3.rollNo = 21;
        s3.studentName = "Krishna";

        float [] weekTempData = new float[7];
        weekTempData[0] = 34.5f;
        weekTempData[1] = 55.55f;

        String userName = "Vairagi Codes";

    }
}
