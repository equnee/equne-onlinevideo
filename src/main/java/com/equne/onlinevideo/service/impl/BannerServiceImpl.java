package com.equne.onlinevideo.service.impl;

import com.equne.onlinevideo.dao.BannerDao;
import com.equne.onlinevideo.entity.Banner;
import com.equne.onlinevideo.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {


    @Autowired
    BannerDao bannerDao;

    @Override
    public List<Banner> getIndexBanner() {
        return bannerDao.findBannerAll();
    }
}
