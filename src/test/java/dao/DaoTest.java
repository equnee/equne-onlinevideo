package dao;
import cn.hutool.core.util.RandomUtil;
import com.equne.onlinevideo.dao.*;
import com.equne.onlinevideo.entity.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
//@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml",
// "classpath:spring/spring-web.xml"})

public class DaoTest {

    @Autowired
    CourseTypeDao courseTypeDao;

    @Autowired
    BannerDao bannerDao;

    @Autowired
    CourseTopicDao courseTopicDao;

    @Autowired
    CourseVideoDao courseVideoDao;

    @Autowired
    ToolsItemDao toolsItemDao;

    @Autowired
    ToolsTypeDao toolsTypeDao;

    @Autowired
    UserDao userDao;

    @Test
    public void t1() {

        CourseType courseType = new CourseType();
        courseType.setFlag(1);
        courseType.setName("数据库优化");

        int code = courseTypeDao.insertCourseType(courseType);
        System.out.println(code);
    }

    @Test
    public void t2() {

        Banner banner = new Banner();
        banner.setCreateTime(new Date());
        banner.setFlag(1);
        banner.setImgUrl("url");
        banner.setTargetUrl("target");
        banner.setType(1);

        int code = bannerDao.insertBanner(banner);
        System.out.println(code);
    }

    @Test
    public void t3() {

        for (int i = 1; i < 100; i++) {
            CourseTopic courseTopic = new CourseTopic();
            courseTopic.setCreateTime(new Date());
            courseTopic.setTitle("Flutter从入门到进阶" + i);
            courseTopic.setCoursewareUrl("none");
            courseTopic.setIconUrl("/static/imgs/card-item.png");
            courseTopic.setFlag(1);
            courseTopic.setIntroUrl("none");
            courseTopic.setTopicIntro("一系列由易到难通用组件开发，让你学会一个基本的组件库的开发思路和技巧。" + i);
            courseTopic.setTypeId(RandomUtil.randomInt(1, 6));
            courseTopic.setViews(1000);
            courseTopic.setVipFlag(RandomUtil.randomInt(0, 2));
            int code = courseTopicDao.insertCourseTopic(courseTopic);
            System.out.println(code);
        }


    }

    @Test
    public void t4() {
        for (int i = 1; i < 100; i++) {
            CourseVideo courseVideo = new CourseVideo();
            courseVideo.setName("Vue3.0（正式版）" + i);
            courseVideo.setFreeView(RandomUtil.randomInt(0, 2));
            courseVideo.setTopicId(i);
            courseVideo.setCreateTime(new Date());
            courseVideo.setFlag(1);
            courseVideo.setVideoUrl1("//player.bilibili.com/player.html?aid=712169146&bvid=BV1iD4y1o7dD&cid=238287362&page=1");

            int code = courseVideoDao.insertCourseVideo(courseVideo);
            System.out.println(code);
        }
    }

    @Test
    public void t5() {


        for (int i = 0; i < 200; i++) {
            ToolsItem toolsItem = new ToolsItem();
            toolsItem.setName("在线转json" + i);
            toolsItem.setToolsTypeId(RandomUtil.randomInt(1, 4));
            toolsItem.setIconUrl("/static/imgs/card-item.png");
            toolsItem.setToolsUrl("https://www.w3school.com.cn/index.html");
            int code = toolsItemDao.insertToolsItem(toolsItem);
            System.out.println(code);
        }
    }

    @Test
    public void t6() {

        ToolsType toolsType = new ToolsType();
        toolsType.setName("toolstype");

        int code = toolsTypeDao.insertToolsType(toolsType);
        System.out.println(code);
    }


    @Test
    public void t7() {

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username");
            user.setPassword("12345" + i);
            user.setVipFlag(1);
            user.setMobile("123456789");
            user.setEmail("12345@qq.com");

            int code = userDao.insertUser(user);
            System.out.println(code);
        }

    }
}
