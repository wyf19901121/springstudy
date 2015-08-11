package com.taobao.shuijin.springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.taobao.shuijin.springstudy.javabeanshow.Performer;
import com.taobao.shuijin.springstudy.javabeanshow.Ticket;

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
//    public static void main( String[] args )
//    {
//    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//    	Performer performer = (Performer) ctx.getBean("cuke");
//        performer.perform();
//    }
//	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
//		Performer performer = (Performer) ctx.getBean("poeticDuke");
//		performer.perform();
//	}
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Ticket ticket1 = (Ticket) ctx.getBean("ticket");
		Ticket ticket2 = (Ticket) ctx.getBean("ticket");
		System.out.println(ticket1 == ticket2);
	}
}
