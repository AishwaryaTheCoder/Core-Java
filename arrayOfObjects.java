class Students {
    String name;
    int rollno;
    int marks;
}

class arrayOfObjects {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.name = "Aishwarya";
        s1.rollno = 12;
        s1.marks = 88;

        Students s2 = new Students();
        s2.name = "Gk";
        s2.rollno = 13;
        s2.marks = 88;
        Students s3 = new Students();
        s3.name = "John";
        s3.rollno = 14;
        s3.marks = 67;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        String strin1 = "Aish";
        String string2 = "Gk";
        System.out.println(strin1 == string2);
        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name + ":" + students[i].marks);
        // }
        for (Students stude : students) {
            System.out.println(stude.name + ":" + stude.marks);
        }
    }
}
