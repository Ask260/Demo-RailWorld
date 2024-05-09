public class Subject {
//    private String subject;
    private String sub_teacherName;
    private int sub_code;

    public Subject(){
    }

    public Subject(String sub_teacherName, int sub_code){
//        this.subject=subject;
        this.sub_teacherName=sub_teacherName;
        this.sub_code=sub_code;
    }

//    public String getSubject(){
//        return subject;
//    }
//    public void setSubject(String subject){
//        this.subject=subject;
//    }

    public String getSub_teacherName(){
        return sub_teacherName;
    }
    public void setSub_teacherName(String sub_teacherName){
        this.sub_teacherName=sub_teacherName;
    }

    public int getSub_code(){
        return sub_code;
    }
    public void setSub_code(int sub_code){
        this.sub_code=sub_code;
    }


    @Override
    public String toString(){
        return
                "Subject teacher  name "+ sub_teacherName+" \n "+
                "subject  code "+ sub_code;
    }
}
