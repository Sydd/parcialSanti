package utn.parcial.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Bill{

    private int id;

    private int total_calls;
    private int cost_price;
    private int total_price;
    private Date created_at;
    private Date due_date; //CAMBIE SQL DATE POR java DATE PORQUE SE SUPONE QUE NO TIENE QEU SER DE SQL O MYSQL O LO QUE SEA.

    private Customer customer;

    private PhoneLine phoneLine;

}
