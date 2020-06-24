package utn.parcial.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employer {
        private int id; // Entity

        private String firstName;

        private String lastName;

        private String username;
        
        private String password;
}
