package com.equne.onlinevideo.service.impl;

import com.equne.onlinevideo.dao.ToolsItemDao;
import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.entity.ToolsItem;
import com.equne.onlinevideo.service.ToolsItemService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class ToolsItemServiceImpl implements ToolsItemService {

    @Autowired
    ToolsItemDao toolsItemDao;

    @Override
    public PageInfo<ToolsItem> getToolsItem(int toolsTypeId) {

        HashMap<String, Object> map = new HashMap<>();
        // 类型ID
        map.put("toolsTypeId", toolsTypeId);


        List<ToolsItem> list = toolsItemDao.findToolsItemByCondition(map);

        PageInfo<ToolsItem> pageInfo = new PageInfo<>(list, 4);

        return pageInfo;
    }

    @Override
    public PageInfo<ToolsItem> getToolsItemAll() {
        HashMap<String, Object> map = new HashMap<>();

        List<ToolsItem> list = toolsItemDao.findToolsItemByCondition(map);

        PageInfo<ToolsItem> pageInfo = new PageInfo<>(list, 4);

        return pageInfo;
    }
}
