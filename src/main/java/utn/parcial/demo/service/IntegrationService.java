package utn.parcial.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import utn.parcial.demo.dto.CustomerPrice;
import utn.parcial.demo.service.component.IntegrationComponent;

@Service
public class IntegrationService {

    @Autowired
    IntegrationComponent integrationComponent;

    public CustomerPrice getUserWithPriceCalls(int idUser)  throws HttpClientErrorException {

        return integrationComponent.getUserPriceLastCallFromApi(idUser);
    }
}
