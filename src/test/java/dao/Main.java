package dao;

import com.equne.onlinevideo.dao.CourseTypeDao;
import org.springframework.beans.factory.annotation.Autowired;

public class Main {

    @Autowired
    static CourseTypeDao courseTypeDao;

    public static void main(String[] args) {


        System.out.println(courseTypeDao);



    }
}
