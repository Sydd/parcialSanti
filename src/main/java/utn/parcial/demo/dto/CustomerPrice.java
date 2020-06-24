package utn.parcial.demo.dto;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Api(value = "User with the name, dni and the price of the last call.")
public class CustomerPrice {
    String name;

    String dni;

    String price;
}
