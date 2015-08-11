package com.taobao.shuijin.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taobao.shuijin.springstudy.javabeanshow.Performer;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//    	Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();
//    }
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	Performer performer = (Performer) ctx.getBean("cuke");
        performer.perform();
    }
}
