package com.taobao.shuijin.springstudy;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taobao.shuijin.springstudy.javabeanshow.Performer;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class AppTest 
{
    /**
     * @return the suite of tests being tested
     */
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        
    }
    @Test
    public void testSpring() {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
