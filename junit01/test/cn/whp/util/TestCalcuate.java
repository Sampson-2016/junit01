package cn.whp.util;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestCalcuate {
	Calcuate cal;
	@Before
	public void setUp(){
		cal = new Calcuate();
	}
	@Test
	public void testAdd(){
		int rel = cal.add(12, 22);
		System.out.println("第一次测试加法 ");
		assertEquals("加法有问题", rel, 35);
	}
	
	@Test
	public void testMinus(){
		int rel = cal.minus(20,10);
		System.out.println("第一次测试减法 ");
		assertEquals("减法有问题", rel, 10);
	}
	
	@Test
	public void testDivide(){
		int rel = cal.divide(20,10);
		System.out.println("第一次测试除法 ");
		assertEquals("除法有问题", rel, 2);
	}
	@Test(expected=ArithmeticException.class)
	public void testDivideException(){
		int rel = cal.divide(20,0);
		System.out.println("第二次测试除法 ");
		assertEquals("除法有问题", rel, 2);
	}
	@Test(timeout=200)
	public void time(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rel = cal.divide(20,10);
		System.out.println("第三次测试除法 ");
		assertEquals("除法有问题", rel, 2);
	}
	
	
	
	
	@Test
	public void testMul(){
		int rel = cal.mul(20,10);
		System.out.println("第一次测试乘法 ");
		assertEquals("乘法有问题", rel, 200);
	}
	
	
	
	
	
}
