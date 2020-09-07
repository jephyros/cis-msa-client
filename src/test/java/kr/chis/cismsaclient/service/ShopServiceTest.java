package kr.chis.cismsaclient.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author InSeok
 * Date : 2020/08/29
 * Remark :
 */
@SpringBootTest
class ShopServiceTest {
    @Autowired
    ShopService shopService;

    @Test
    public void shopListTest() {
        shopService.shopList();
    }

    @Test
    public void testmath(){
        //System.out.println(Math.pow(81000000,1.0/10.285));
        //double v = calcPow(8100000000000000000D, 1.0 / 10.285);
        double v = Math.pow(810000000000000000D, 1.0 / 10.285);
        //double v = Math.pow(64D,1.0/3.0);
        //double v = calcPow(4D, 1.0 / 2.0);
        //Math.pow(2,1.0 / 2.0 );
        System.out.println(v);
    }

    public double calcPow(double a, double n){
        if(n == 0.0){
            return 1.0;
        }else{
            double temp = calcPow(a, n/2);
            if(n%2 == 0) return temp*temp;
            else return temp*temp*a;
        }
    }
}