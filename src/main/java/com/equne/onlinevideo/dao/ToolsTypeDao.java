package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.ToolsType;

import java.util.List;

public interface ToolsTypeDao {

    int insertToolsType(ToolsType toolsType);

    List<ToolsType> findToolsTypeAll();
}
