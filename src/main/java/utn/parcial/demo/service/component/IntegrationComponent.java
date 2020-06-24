package utn.parcial.demo.service.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import utn.parcial.demo.dto.CustomerPrice;

import javax.annotation.PostConstruct;
@Slf4j
@Component
public class IntegrationComponent {

    private RestTemplate rest;

    private static String url = "http://localhost:8080/customer/pricelastcall/";


    @PostConstruct
    private void init() {
        rest = new RestTemplateBuilder()
                .build();
    }
    public CustomerPrice getUserPriceLastCallFromApi(Integer id) throws HttpClientErrorException {
        String urlCustomerPrice = url + id.toString();

        return rest.getForObject(urlCustomerPrice, CustomerPrice.class);

    }
}
