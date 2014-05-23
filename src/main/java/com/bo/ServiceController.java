package com.bo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Class Service.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
@Controller
public class ServiceController {

    private String value = "NONE";

    public ServiceController() {
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return value + " [" + new Date() + "]";
    }

    @RequestMapping("/set")
    @ResponseBody
    public void update(@RequestParam String value) {
        this.value = value;
    }

}
