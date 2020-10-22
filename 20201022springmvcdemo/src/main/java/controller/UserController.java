package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/testString")
  @ResponseBody
  public String testString(){
    System.out.println("testString方法执行了");
    return "success";
  }

}
