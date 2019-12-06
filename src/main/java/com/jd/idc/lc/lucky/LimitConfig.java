package com.jd.idc.lc.lucky;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@ConfigurationProperties(prefix = "limit")
public class LimitConfig {

    private BigDecimal min;

    private BigDecimal max;

    private String desc;

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMin() {
        return min;
    }


    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMax() {
        return max;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
