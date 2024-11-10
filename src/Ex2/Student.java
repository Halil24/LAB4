package Ex2;

import java.rmi.StubNotFoundException;

public class Student {

    private String name;
    private String lastname;

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;

    }
    public String getLastname() {
        return lastname;
    }
}
