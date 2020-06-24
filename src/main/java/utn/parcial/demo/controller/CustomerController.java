package utn.parcial.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import utn.parcial.demo.service.IntegrationService;

import java.util.Calendar;

@RestController
@RequestMapping("/api")
public class CustomerController {


    @Autowired
    IntegrationService integrationService;


    @GetMapping("/customer/{id_customer}")
    @ApiOperation(value="Get a user with the price of the last call.")
    @ApiResponses( value = {
    @ApiResponse(code = 200, message = "Get the user." ),
    @ApiResponse(code = 404, message = "The user was not found." ),
    @ApiResponse(code = 400, message = "Bad request, you need to use an integer as ID." )})

    public ResponseEntity loginUser(@PathVariable Integer id_customer){
        try {
            return ResponseEntity.ok(integrationService.getUserWithPriceCalls(id_customer));
        } catch ( HttpClientErrorException err) {
            if (err.getStatusCode() == HttpStatus.CONFLICT){
                return new ResponseEntity("User not found", HttpStatus.NOT_FOUND);
            }

            return  ResponseEntity.badRequest().build();
        }
    }


}
