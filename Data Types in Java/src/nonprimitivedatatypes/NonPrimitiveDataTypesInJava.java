package nonprimitivedatatypes;

class Student {
    int rollNo;
    String studentName;
}
public class NonPrimitiveDataTypesInJava {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 10;
        s1.studentName = "Radha";

        Student s2 = s1;

        Student s3 = new Student();
        s3.rollNo = 11;
        s3.studentName = "Krishna";

        //Array Data-Type to store multiple value of same type
        float [] weekTempData = new float[7];
        weekTempData[0] = 34.5f;
        weekTempData[1] = 55.55f;

        //String Data-Type to store multiple characters
        String userName = "Vairagi Codes";
        System.out.println(userName);

    }
}
