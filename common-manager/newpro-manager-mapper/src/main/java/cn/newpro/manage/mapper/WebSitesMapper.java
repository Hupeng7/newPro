package cn.newpro.manage.mapper;

import cn.newpro.common.mapper.SysMapper;
import cn.newpro.manage.pojo.WebSites;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/4/8 0008
 */
@Repository
public interface WebSitesMapper extends SysMapper<WebSites> {
    List<WebSites> findWebSiteList();
}
