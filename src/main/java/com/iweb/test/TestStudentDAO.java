package com.iweb.test;

import com.iweb.dao.StudentDAO;
import com.iweb.dao.impl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 测试类 用于DAO接口测试
 * @Test 将指定方法标记为测试方法 可以不依赖于main方法直接运行
 * @Before 在所有测试方法 运行之前执行的代码 一般用于环境的初始化
 * @After 在所有测试方法运行之后执行的代码 一般用于资源回收
 * @author lisiqi
 * @date 2024/7/23 11:02
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @Test
    public void testFindById(){
        Assert.assertNotNull(studentDAO.findById(1));
//        Assert.assertNotNull(null);
    }
    @Test
    public void testFindAll(){
        System.out.println(studentDAO.findAll().toString());
        Assert.assertNotNull(studentDAO.findAll().toString());
    }
    @Test
    public void testCount(){
        System.out.println(studentDAO.count().equals(7));
        Assert.assertEquals(7L,(long)studentDAO.count());
    }
    @Test
    public void testFindWithLimit(){
        System.out.println(studentDAO.findWithLimit(0,5));
        Assert.assertNotNull(studentDAO.findWithLimit(0,5));
    }
    @Test
    public void testFindByNameLikeWithLimit(){
        System.out.println(studentDAO.findByNameLikeWithLimit("李",0,3));
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("李",0,3));
    }
    @Test
    public void testFindByNameLike(){
        System.out.println(studentDAO.findByNameLike("l"));
        Assert.assertNotNull(studentDAO.findByNameLike("l"));
    }

}
