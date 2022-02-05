public class Person {
    protected String fullname;
    protected String age;
    protected String passport;

    
    public Person(String fullname, String age, String passport) {
        this.fullname = fullname;
        this.age = age;
        this.passport = passport;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "information of customer [ Fullname: "  + fullname + ", age: " + age + ", identity card number: " + passport + "]";
    }
}
