package utn.parcial.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class State {

    private int id; //Entity

    private String stateName;

    private List<City> cities;
}
