package com.test;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("in f");
  }
  @Test(priority=3)
  public void k() {
	  System.out.println("in k");  
  }
  @Test(priority=2)
  public void n() {
	  System.out.println("in n");
  }
}
