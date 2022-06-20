package com.equne.onlinevideo.service;

import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.entity.ToolsItem;
import com.github.pagehelper.PageInfo;

public interface ToolsItemService {

    PageInfo<ToolsItem> getToolsItem(int typeId);

    PageInfo<ToolsItem> getToolsItemAll();
}
