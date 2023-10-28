package ObjectsAndClassesL06;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    private String city;

    public Student(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city ;
    }


    public String getFirstName(){
        return this.firstName=firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName=lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
       return this.age = age;
    }
    public void setAge(int age){
        this.age = this.age;
    }
    public String getCity(){
        return this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
