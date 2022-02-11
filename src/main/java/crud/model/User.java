package crud.model;

/*import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;*/

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    //@NotEmpty(message = "Name should not be empty")
    //@Size(min = 2, max = 20, message = "Name length should be between 2 and 20")
    private String name;

    @Column(name = "age")
    //@Min(value = 0, message = "Min age is 0")
    //@Max(value = 100, message = "Max age is 100")
    private byte age;

    public User() {}

    public User(String firstName, byte age) {
        this.name = firstName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
