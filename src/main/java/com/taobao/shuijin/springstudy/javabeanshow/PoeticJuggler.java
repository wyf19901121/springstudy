package com.taobao.shuijin.springstudy.javabeanshow;

public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		// TODO Auto-generated constructor stub
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		// TODO Auto-generated constructor stub
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() {
		super.perform();
		System.out.println("While reciting ....");
		poem.recite();
	}
}
