package com.gkfcsolution.limitsservice.controller;

import com.gkfcsolution.limitsservice.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frank GUEKENG
 * @creates 21/11/2020 - 10:58
 * @project limits-service
 */

@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitsConfiguration limits;

    @GetMapping("/limits")
    public LimitsConfiguration returnLimits(){
        return new LimitsConfiguration(limits.getMaximum(), limits.getMinimum());
    }
}
