public class Student extends Person{
    private double  GPA;
    private int id;
    public Student(String name, String phoneNumber, int id,double Gpa) {
        super(name, phoneNumber);
        this.GPA=Gpa;
        this.id=id;
    }
    public double getGPA(){
        return GPA;

    }
    public int getID(){
        return id;

    }
    public void setGPA(double  num) {
        this.GPA = num;
    }


    public String toString() {
        String idd = "ID: ";
        String gpp= "GPA: ";

        return super.toString()+", "+idd+this.getID()+",  "+gpp+this.getGPA();


    }
}
