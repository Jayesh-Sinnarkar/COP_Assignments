import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of students in class: ");
        int studCount = sc.nextInt();

        StudentInfo[] stud = new StudentInfo[studCount];

        for(int i=0;i<studCount;i++)
                    stud[i] = new StudentInfo();


        for(int j=0;j<studCount;j++)
        {   
          System.out.println("----------------------------------------------");

            System.out.print("\nEnter Roll Number: ");
            stud[j].setRollNo(sc.nextInt()); 
            sc.nextLine();
            
            System.out.print("\nEnter Name: ");
            stud[j].setName(sc.nextLine()); 

            System.out.print("\nEnter Subject1 marks: ");
            stud[j].setSub1Marks(sc.nextInt()); 

            System.out.print("\nEnter Subject 2 marks: ");
            stud[j].setSub2Marks(sc.nextInt()); 

            System.out.print("\nEnter Subject 3 marks: ");
            stud[j].setSub3Marks(sc.nextInt()); 

        }

        for(int k=0;k<studCount;k++)
        {   
            System.out.println("----------------------------------------------");
            System.out.println("Student Roll Number"+ stud[k].getRollNo());
            System.out.println("Student Name"+stud[k].getName());
            System.out.println("Student Subject1 marks: "+stud[k].getSub1Marks());
            System.out.println("Student Subject 2 marks: "+stud[k].getSub2Marks());
            System.out.println("Student Subject 3 marks: "+stud[k].getSub3Marks());
            System.out.println("----------------------------------------------");

        }

        for(int l=0;l<studCount;l++)
        {
            System.out.println("\n\n*************RESULT*************");
        if(stud[l].isStudentPassed(stud[l].getSub1Marks(), stud[l].getSub2Marks(), stud[l].getSub3Marks())==true)
                System.out.println("\nRoll Number "+stud[l].getRollNo()+" is passed.");
    
        if(stud[l].isStudentFailed(stud[l].getSub1Marks(), stud[l].getSub2Marks(), stud[l].getSub3Marks())==true)
                System.out.println("\nRoll Number "+stud[l].getRollNo()+" is failed.");
        }
                
    }

}



    

