package utn.parcial.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Call{

    private int id;

    private float callDuration;

    private float totalPrice;

    private PhoneLine phoneLine;

    private City cityTo;

    //SI TENES MAS DE UN JSONBACKREFERENCE TENES QUE PONERLE DISTINTO NOMBRE CON VALUE.

    private City cityFrom;

    private Date callDate;

    private PhoneLine phoneLineDestiny;

    private Customer customer;
/*/
  /*  @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Rate rate;*/
}
