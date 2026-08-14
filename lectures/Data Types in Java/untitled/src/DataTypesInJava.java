class Student {
    int rollNo;
    String studentName;
}

public class DataTypesInJava {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 10;
        s1.studentName = "Radha";

        Student s2 = s1;

        Student s3 = new Student();
        s3.rollNo = 11;
        s3.studentName = "Krishna";

        String userName = "Vairagi Codes";

        System.out.println(userName);

        float [] weekTemp = new float[7];
        weekTemp[0] = 35.5f;
        weekTemp[1] = 36.56f;


    }
}
