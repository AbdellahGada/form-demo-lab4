package comp31.formdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    String userId;
    String firstName;
    String lastName;

    // Require no-arg constructor

    // public Person() {
    // super();
    // }

    // public String getUserId() {
    // return userId;
    // }

    // public void setUserId(String userId) {
    // this.userId = userId;
    // }

    // public String getFirstName() {
    // return firstName;
    // }

    // public void setFirstName(String firstName) {
    // this.firstName = firstName;
    // }

    // public String getLastName() {
    // return lastName;
    // }

    // public void setLastName(String lastName) {
    // this.lastName = lastName;
    // }

}
