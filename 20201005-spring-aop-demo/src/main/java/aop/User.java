package aop;

import org.springframework.context.annotation.ComponentScan;

//1.创建被增强类，在类里面定义方法
@ComponentScan
public class User {
  public void add(){
    System.out.println("add...");
  }


}
