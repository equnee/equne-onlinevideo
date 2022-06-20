package com.equne.onlinevideo.dao;

import com.equne.onlinevideo.entity.Banner;

import java.util.List;

public interface BannerDao {

    int insertBanner(Banner banner);

    List<Banner> findBannerAll();
}
