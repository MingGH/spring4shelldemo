package run.runnable.spring4shelldemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import run.runnable.spring4shelldemo.entity.ShoppingCart;

import java.util.Map;
import java.util.Objects;

/**
 * @author Asher
 * on 2022/4/17
 */
@Controller
public class ShoppingCartController {

    private final static Logger logger = LoggerFactory.getLogger(ShoppingCartController.class);

    @RequestMapping(value = "/total", method = RequestMethod.POST)
    @ResponseBody
    public ShoppingCart total(@RequestParam Map<String, String> requestparams, ShoppingCart shoppingCart) {
        String userId = requestparams.get("userId");
        logger.info("userId:{}", userId);
        //query from DB
        Long total = 100L;
        shoppingCart.setTotal(total);
        return shoppingCart;
    }


}
