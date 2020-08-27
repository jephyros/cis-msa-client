package kr.chis.cismsaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author InSeok
 * Date : 2020-08-24
 * Remark :  주문 컨트롤러
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("")
    public String index(){
        return "/order/index";
    }
}
