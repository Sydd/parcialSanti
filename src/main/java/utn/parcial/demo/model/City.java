package utn.parcial.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class City{
    private int id;  //Entity
    private String cityName;
    private int linePrefix;

    private float costPerMinute;

    private float pricePerMinute;

    private List<Customer> customers;

    //EL MappedBy lleva el nombre del atributo en la clase referenciada. En nuestor caso CityTo.
    @JsonIgnore
    private List<Call> callsFrom;

    //EL MappedBy lleva el nombre del atributo en la clase referenciada. En nuestor caso CityFrom.
    private List<Call> callsTo;


    private State state;
}
