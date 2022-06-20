package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.entity.ToolsItem;

import java.util.HashMap;
import java.util.List;

public interface ToolsItemDao {

    List<ToolsItem> findToolsItemByCondition(HashMap<String, Object> map);

    int insertToolsItem(ToolsItem toolsItem);
}
