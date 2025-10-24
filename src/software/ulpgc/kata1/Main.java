package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Esteban", LocalDate.of(2004, 6, 25));
        System.out.println(person);
    }
}
