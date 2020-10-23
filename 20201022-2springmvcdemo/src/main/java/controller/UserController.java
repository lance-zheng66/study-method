package controller;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import domian.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/testString")
  public String testString(Model model){
    System.out.println("testString方法执行了");

    //模拟从数据库中查询出 User对象
    final User user = new User();
    user.setName("美美");
    user.setPassword("123");
    user.setAge("23");
    model.addAttribute("user",user);
    return "success";
    //model

  }


  /**
   * 是void
   * 请求转发一次请求，不用编写项目的名称
   */
  @RequestMapping("/testVoid")
  public void testVoid(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    System.out.println("testString方法执行了");
    //编写请求转发的程序
    // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

    //重定向，两次请求
    //response.sendRedirect(request.getContextPath()+"index.jsp");
   // return;//转发后不再让后面的代码执行

    //设置中文乱码
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html;charset=UTF-8");


    //直接进行响
    response.getWriter().print("你好");

  }

  /**
   * ModelAndView
   * @return
   */
  @RequestMapping("/testModelAndView")
  public ModelAndView testModelAndView(){
    //创建ModelAndView对象
    ModelAndView mv = new ModelAndView();

    System.out.println("testString方法执行了");
    //模拟从数据库中查询出 User对象
    final User user = new User();
    user.setName("美美");
    user.setPassword("123");
    user.setAge("23");
    //把user对象存储到mv对象中，也会把user对象存入到request对象
    mv.addObject("user",user);
    //跳转到哪个页面
    mv.setViewName("success");
    return mv;
    //model

  }

  /**
   * 使用关键字的方式进行转发或者重定向
   * @return
   */
  @RequestMapping("/testForwardOrRedirect")
  public String testForwardOrRedirect(){
    System.out.println("testForwardOrRedirect方法执行了");

    //请求的转发
    //return "forward:/WEB-INF/pages/success.jsp";
    //重定向
    return "redircect:/index.jsp";

  }

  /**
   * 模拟异步请求和和响应
   * @return
   */
  @RequestMapping("/testAjaxt")
  public void testAjax(@RequestBody String body){
    System.out.println("testAjaxt方法执行了");
    System.out.println(body);
  }



}
