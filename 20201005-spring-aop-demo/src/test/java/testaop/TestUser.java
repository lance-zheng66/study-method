package testaop;

import aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
  @Test
  public void test1(){
    ApplicationContext context =
        new ClassPathXmlApplicationContext("aopbean.xml");
    final User user = context.getBean("user", User.class);
    user.add();

  }

}
