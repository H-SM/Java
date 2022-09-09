import java.util.Scanner;
//this is the sample program made for rachit in order the sudmission of his work , may be a future refrence code over working of mutatotr
public class nice {
    String name;
    Integer R_NO;
    Integer SAP_ID;
    String DOB;
    double SGPA;
    String course;

    public String WhtsName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Integer getUrRNO() {
        return R_NO;
    }

    void setRNO(Integer R_NO) {
        this.R_NO = R_NO;
    }

    public Integer getSAPID() {
        return SAP_ID;
    }

    void setSAPID(Integer SAP_ID) {
        this.SAP_ID = SAP_ID;
    }

    public String getDOB() {
        return DOB;
    }

    void setDOB(String dOB) {
        this.DOB = dOB;
    }

    public double getSGPA() {
        return SGPA;
    }

    void setGPA(double gPA) {
        this.SGPA = gPA;
    }

    public String getCourse() {
        return course;
    }

    void setCourses(String course) {
        this.course = course;
    }

    public static void main(String args[]) {
        nice student1 = new nice();
        // taking inputs using scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = in.nextLine();
        System.out.println("Enter Roll Number: ");
        Integer rollNo = in.nextInt();
        System.out.println("Enter SAP ID: ");
        Integer sap = in.nextInt();
        System.out.println("Enter Date of birth (eg-01/01/2003)[str]: ");
        in.nextLine();
        String Dob = in.nextLine();
        System.out.println("Enter Marks in SGPA: ");
        double sgp = in.nextDouble();
        System.out.println("Enter course: ");
        in.nextLine();
        String cour = in.nextLine();
        System.out.println(" ");
        // calling mutator methods
        student1.setName(name);
        student1.setRNO(rollNo);
        student1.setSAPID(sap);
        student1.setGPA(sgp);
        student1.setDOB(Dob);
        student1.setCourses(cour);
        // calling accessor methods
        System.out.println("Name: " + student1.WhtsName());
        System.out.println("Roll NO: " + student1.getUrRNO());
        System.out.println("SAPID: " + student1.getSAPID());
        System.out.println("GPA: " + student1.getSGPA());
        System.out.println("DOB: " + student1.getDOB());
        System.out.println("Course: " + student1.getCourse());
        in.close();
    }
}
