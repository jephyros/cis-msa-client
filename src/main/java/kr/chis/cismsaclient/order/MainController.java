package kr.chis.cismsaclient.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author InSeok
 * Date : 2020-08-27
 * Remark :
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
