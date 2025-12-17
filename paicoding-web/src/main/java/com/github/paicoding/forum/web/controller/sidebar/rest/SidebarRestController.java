package com.github.paicoding.forum.web.controller.sidebar.rest;

import com.github.paicoding.forum.api.model.vo.ResVo;
import com.github.paicoding.forum.api.model.vo.recommend.SideBarDTO;
import com.github.paicoding.forum.service.sidebar.service.SidebarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Vio
 * @Package com.github.paicoding.forum.web.controller.sidebar.rest
 * @Date 2025/12/17 17:14
 * @description: 用于返回所有的侧边栏
 */
@RestController
@RequestMapping(path = "sidebar/")
public class SidebarRestController {
    private SidebarService sidebarService;

    public SidebarRestController(SidebarService sidebarService) {
        this.sidebarService = sidebarService;
    }

    @RequestMapping(path = "list")
    public ResVo<List<SideBarDTO>> listHomeSidebar() {
        List<SideBarDTO>list = sidebarService.queryHomeSidebarList();
        return ResVo.ok(list);
    }

}
