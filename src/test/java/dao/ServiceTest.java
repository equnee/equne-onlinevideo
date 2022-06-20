package dao;

import com.equne.onlinevideo.entity.CourseTopic;
import com.equne.onlinevideo.service.CourseTopicService;
import com.equne.onlinevideo.service.UserService;
import com.equne.onlinevideo.service.impl.MailSenderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
public class ServiceTest {


    @Autowired
    UserService userService;

    @Autowired
    MailSenderService mailSenderService;


    @Autowired
    CourseTopicService courseTopicService;


    @Test
    public void t3() {

        PageHelper.startPage(1, 4);
        PageInfo<CourseTopic> list = courseTopicService.getIndexCourseTopic(4);

        System.out.println(list.getPageSize());
        System.out.println(    list.getSize());

        System.out.println(list.getList().size());
    }


    @Test
    public void t1() {

        System.out.println(userService.existEmail("123@qq.com"));
    }

    @Test
    public void t2() {

        try {
            mailSenderService.send();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
