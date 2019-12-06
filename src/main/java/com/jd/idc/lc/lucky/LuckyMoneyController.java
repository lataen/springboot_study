package com.jd.idc.lc.lucky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class LuckyMoneyController {

    @Autowired
    private LuckyMoneyRepository repository;


    @GetMapping("/lucky_moneys")
    public List<LuckyMoney> list() {
        return repository.findAll();
    }

    @PostMapping("/lucky_money")
    public LuckyMoney create(@RequestParam("producer") String producer,
                             @RequestParam("money") BigDecimal money) {

        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(producer);
        luckyMoney.setMoney(money);
        return repository.save(luckyMoney);
    }
}
