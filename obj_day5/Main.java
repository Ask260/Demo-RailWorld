public class Main {
    public static void main(String[] args) {
        School school=new School();
        Student student=new Student();
        Subject subject=new Subject();


         school.setSubject(new Subject("ashu",101));
         System.out.println(school.getSubject());




    }
}
