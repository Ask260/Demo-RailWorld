public class Student {

    private String studentName;
    private Subject subject ;

    public Student(){
    }

    public Student(String studentName, Subject subject){
        this.studentName=studentName;
        this.subject=subject;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setSubject(String studentName){
        this.studentName=studentName;
    }

    public Subject getSubject(){
        return subject;
    }
    public void setSubject(Subject subject){
        this.subject=subject;
    }

    @Override
    public String toString(){
        return  "student ka naam= { " + studentName+" "+
                "student ka subject "+ subject;
    }

}
