public class Person {
    protected String fullname;
    protected String age;
    protected String identityCardNumber;

    
    public Person(String fullname, String age, String identityCardNumber) {
        this.fullname = fullname;
        this.age = age;
        this.identityCardNumber = identityCardNumber;
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
        return identityCardNumber;
    }
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String toString() {
        return "information of customer [ Fullname: "  + fullname + ", age: " + age + ", identity card number: " + identityCardNumber + "]";
    }
}
