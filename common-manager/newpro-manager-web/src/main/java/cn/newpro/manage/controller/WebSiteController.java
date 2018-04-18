package cn.newpro.manage.controller;

import cn.newpro.common.vo.EasyUIResult;
import cn.newpro.manage.pojo.WebSites;
import cn.newpro.manage.service.WebSiteService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
    public EasyUIResult findWebSiteList(@PathVariable int page,@PathVariable int rows) {
        System.out.println("=========>controller");
        return webSiteService.findWebSiteList(page, rows);
    }

    @RequestMapping(name="/findById",method= RequestMethod.GET)
    @ResponseBody
    public Object findById(@PathVariable int id){
        System.out.println("=====id====="+id);
        WebSites ws = webSiteService.findById(id);
        System.out.println(ws);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName( "viewName" );
        modelAndView.addObject( "viewName" , ws);
        return modelAndView;
        //return ws;
    }

    @ModelAttribute( "/getWebSites" )
    public WebSites getWebSites() {
        System. out .println( "---------getUser-------------" );
        return new WebSites();
    }

    @RequestMapping("/page/{index}")
    public String toIndex(@PathVariable String index) {
        System.out.println("11111111");
        return index;
    }
}
