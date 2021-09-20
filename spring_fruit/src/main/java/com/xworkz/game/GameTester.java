package com.xworkz.game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String beanconfig="applicationContext1.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(beanconfig);
		
		Game game1 = context.getBean(Game.class);
		System.out.println(game1);
		System.out.println(game1.hashCode());
		
	    game1.play();
	    game1.cricket.bat();
	    
		
		Game game2 = context.getBean(Game.class);
		System.out.println(game2.hashCode());
		
		Game game3 = context.getBean(Game.class);
		System.out.println(game3.hashCode());
		

	}

}
