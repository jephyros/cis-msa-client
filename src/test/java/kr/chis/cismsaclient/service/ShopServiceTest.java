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
}