
public class StudentInfo{

    private String name;
    private int rollNo;
    private int sub1Marks;
    private int sub2Marks;
    private int sub3Marks;
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSub1Marks(int sub1Marks) {
        this.sub1Marks = sub1Marks;
    }

    public void setSub2Marks(int sub2Marks) {
        this.sub2Marks = sub2Marks;
    }

    public void setSub3Marks(int sub3Marks) {
        this.sub3Marks = sub3Marks;
    }

    public StudentInfo()
    {
        name = "Student Name";
    }
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getSub1Marks() {
        return sub1Marks;
    }

    public int getSub2Marks() {
        return sub2Marks;
    }

    public int getSub3Marks() {
        return sub3Marks;
    }


     public boolean isStudentPassed(int marksSub1, int marksSub2, int marksSub3) 
    {
        int totalMarks = marksSub1+marksSub2+marksSub3;

        if(marksSub1>40 && marksSub2>40 && marksSub3>40 && totalMarks>120)
            return true;
        else
            return false;
    }

    public boolean isStudentFailed(int marksSub1, int marksSub2, int marksSub3) 
    {
        int totalMarks = marksSub1+marksSub2+marksSub3;

        if(marksSub1<=40 || marksSub2<=40 || marksSub3<=40 || totalMarks<=120)
            return true;
        else
            return false;
   }
    
}


