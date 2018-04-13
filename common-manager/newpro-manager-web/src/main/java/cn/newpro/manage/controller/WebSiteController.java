package cn.newpro.manage.controller;

import cn.newpro.common.vo.EasyUIResult;
import cn.newpro.manage.service.WebSiteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @date 2018/3/22 0022
 */
@Controller
@RequestMapping("/websites")
public class WebSiteController {
    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private WebSiteService webSiteService;

    @RequestMapping("/query")
    @ResponseBody
    public EasyUIResult findWebSiteList(int page, int rows) {
        System.out.println("=========>controller");
        return webSiteService.findWebSiteList(page, rows);
    }

    @RequestMapping("/page/{index}")
    public String toIndex(@PathVariable String index) {
        return index;
    }
}
