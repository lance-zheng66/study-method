package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
public class UserProxy {


  //前置通知
  @Before(value = "execution(* aop.User.add(..))")
  public void before(){
    System.out.println("before......");
  }

}
