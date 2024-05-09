public class School {
    private String schoolName;
    private Student student;
    private Subject subject;

    public School(){
    }

    public School(String schoolName, Student student, Subject subject){
        this.schoolName=schoolName;  //here we are initializing the datatype;
        this.student=student;
        this.subject=subject;
    }

    public String getSchoolName(){
       return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }

    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student=student;
    }
    public Subject getSubject(){
        return subject;
    }
    public void setSubject(Subject subject){
        this.subject=subject;
    }

    @Override
    public String toString(){
        return "School= {" +
                "school ka naam " + schoolName+" "+
                "student ka naam " +  student+" "+
                "subject ka sub "+ subject;


    }

}

