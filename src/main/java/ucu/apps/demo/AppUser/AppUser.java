//package ucu.apps.demo.AppUser;
//
//import lombok.Getter;
//import lombok.Setter;
//
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.Transient;
//import java.time.LocalDate;
//import java.time.Period;
//
//@Table
//@Entity
//@Getter@Setter
//public class AppUser {
//    @Id
//    @GeneratedValue
//    private int id;
//    private String email;
//    private LocalDate dob;
//    @Transient
//    private int age;
//
//    public int getAge() {
//        return Period.between(dob, LocalDate.now()).getYears();
//    }
//}