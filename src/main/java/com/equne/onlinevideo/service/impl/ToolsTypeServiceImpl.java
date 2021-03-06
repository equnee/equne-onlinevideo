package com.equne.onlinevideo.service.impl;

import com.equne.onlinevideo.dao.ToolsTypeDao;
import com.equne.onlinevideo.entity.ToolsType;
import com.equne.onlinevideo.service.ToolsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolsTypeServiceImpl implements ToolsTypeService {

    @Autowired
    ToolsTypeDao toolsTypeDao;

    @Override
    public List<ToolsType> getToolsTypeAll() {
        return toolsTypeDao.findToolsTypeAll();
    }
}
