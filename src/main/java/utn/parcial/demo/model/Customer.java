package utn.parcial.demo.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private int id; //Entity

    private String firstName;

    private String lastName;

    private String dni;

    private String username;

    private String password;

    private Date createdAt;

    @JsonBackReference
    private City city;

    private List<PhoneLine> phoneLines;

    private List<Bill> bills;

    private List<Call> calls;

}
