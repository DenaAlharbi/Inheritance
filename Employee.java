public class Employee extends Person{
    private int id;
    private int monthlySalary;
    public Employee(String name, String phone ,int id,int month){
        super(name,phone);
this.monthlySalary=month;
this.id=id;
    }
    public int getMonthlySalary(){
        return monthlySalary;
    }
    public void setMonthlySalary( int num){
        this.monthlySalary=num;
    }
    public String toString() {
        String id = "ID: ";
        String mp= "MONTHLY SALARY: ";
        return super.toString()+", "+id+this.id+", "+mp+this.getMonthlySalary();


    }
}
