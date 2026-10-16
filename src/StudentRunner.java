public static void main (String [] args){
    Student student1 = new Student("Charles", "Smith", 2023);
    student1.addTestScore(85.2);
    student1.addTestScore(90.6);
    student1.addTestScore(83.7);
    System.out.println(student1.getStudentInfo());
}