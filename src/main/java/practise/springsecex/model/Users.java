package practise.springsecex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Users {

    @Id
    private int id;
    private String username;
    private String password;

}
