package SpringDataJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;

}
