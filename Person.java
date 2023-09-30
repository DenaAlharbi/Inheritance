import javax.lang.model.element.Name;

public class Person {
    private String Name;
    private String PhoneNum;
    public Person(String name, String phoneNumber){
        this.Name= name;
        this.PhoneNum = phoneNumber;
    }

    public String getName(){
        return Name;
    }
    public String getPhoneNum(){
        return PhoneNum;

    }
    public void setName(String name){
        this.Name= name;
    }
    public void setPhoneNum(String num){
        this.PhoneNum= num;
    }

    public String toString() {
        String name = "Name: ";
        String phone= "Phone number: ";
        return name+this.getName()+", "+phone+this.getPhoneNum();

    }
}
