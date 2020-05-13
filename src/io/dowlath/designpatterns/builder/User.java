package io.dowlath.designpatterns.builder;

/**
 * @Author Dowlath
 * @create 5/13/2020 4:56 AM
 */
public class User {
    // All final attributes
    // Here String itself final
    private  String firstName; // required
    private  String lastName;  // required
    private  int age;   // optional
    private String phone;    // optional
    private String address;   // optional

    public  User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User : " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' ;
    }

    public static class UserBuilder{
        private  String firstName; // required
        private  String lastName;  // required
        private  int age;   // optional
        private String phone;    // optional
        private String address;   // optional

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }

    }

}
