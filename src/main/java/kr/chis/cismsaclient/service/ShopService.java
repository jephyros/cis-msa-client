package kr.chis.cismsaclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author InSeok
 * Date : 2020/08/29
 * Remark :
 */
@Component
public class ShopService {


    public void shopList(){
        RestTemplate rt = new RestTemplate();
        String url = "http://localhost:8181/api/v1/shops";
        //rt.getForObject(url, String.class);
        String result = rt.getForObject(url, String.class);
        System.out.println(result);

    }

}
