package cn.newpro.manage.service;

import cn.newpro.common.service.BaseService;
import cn.newpro.common.vo.EasyUIResult;
import cn.newpro.manage.mapper.WebSitesMapper;
import cn.newpro.manage.pojo.WebSites;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/4/8 0008
 */
@Service
public class WebSiteService extends BaseService<WebSites> {
    @Autowired
    private WebSitesMapper webSitesMapper;

    /**
     * 查询所有列表
     * @param page
     * @param rows
     * @return
     */
    public EasyUIResult findWebSiteList(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<WebSites> webSiteList = webSitesMapper.findWebSiteList();
        System.out.println(webSiteList);
        PageInfo<WebSites> info = new PageInfo<WebSites>(webSiteList);
        return new EasyUIResult(info.getTotal(), info.getList());
    }
}
