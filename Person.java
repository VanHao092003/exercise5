public class Person {
    protected String fullname;
    protected String age;
    protected String passport;

    
    public Person(String fullname, String age, String identityCardNumber) {
        this.fullname = fullname;
        this.age = age;
        this.passport = identityCardNumber;
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
    public String getIdentityCardNumber() {
        return passport;
    }
    public void setIdentityCardNumber(String identityCardNumber) {
        this.passport = identityCardNumber;
    }

    @Override
    public String toString() {
        return "information of customer [ Fullname: "  + fullname + ", age: " + age + ", identity card number: " + passport + "]";
    }
}
