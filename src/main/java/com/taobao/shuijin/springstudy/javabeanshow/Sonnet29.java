package com.taobao.shuijin.springstudy.javabeanshow;

public class Sonnet29 implements Poem {
	
	private String str;
	public Sonnet29(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
	}
	@Override
	public void recite() {
		// TODO Auto-generated method stub
		System.out.println(str);
	}

}
