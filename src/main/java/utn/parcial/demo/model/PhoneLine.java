package utn.parcial.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utn.parcial.demo.model.Bill;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PhoneLine {

    private int id; //Entity
    private String lineType; //todo esto debe ser un enumerador.
    private String lineNumber;


    private List<Bill> bills;

    private List<Call> callList;

    private Customer customer;
}
