package com.taobao.shuijin.springstudy.javabeanshow;

public class Juggler implements Performer {
	
	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}

}
