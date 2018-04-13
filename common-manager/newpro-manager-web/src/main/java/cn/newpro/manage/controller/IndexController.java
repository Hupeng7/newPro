package cn.newpro.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @date 2018/4/13 0013
 */
@Controller
public class IndexController {
    @RequestMapping("/page/{index}")
    public String toIndex(@PathVariable String index) {
        return index;
    }
}
