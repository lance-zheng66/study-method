package com.springdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
@Controller:创建处理器对象，对象放在Springmvc容器中
 位置：在类的上面

 能处理请求得都是控制器; MyController能处理轻请求叫做后端控制器（back controller）
*/
@Controller
public class MyController {
  /**
   * 处理用户的请求，springmvc中是使用方法来处理的
   * 方法是自定义的，可以有多种返回值，多种参数，方法自定义
   */


  /**
   * 准备使用dosome方法处理some.da的请求
   * @RequestMapping : 请求映射，作用是把一个请求地址和一个方法绑定在一起
   * 一个请求指定一个方法处理
   * 属性：1.value 是一个String，表示强求的URL地址（some.do）
   *       value的值是唯一的，不能重复
   *       在使用時，推薦地址以"/"开头
   * 位置：1.在方法的上面，常用的
   *      2.在类的上面
   *说明：说明RequestMapping修饰的方法叫做处理器方法或者控制器方法
   * @RequestMapping修饰的方法可以处理请求，类似Servlet中的 doGet，doPost
   *
   * 返回值：ModelAndView 本次返回的结果
   * Model:数据，请求处理完成后要显示给用户的数据
   * View:视图，比如Jsp
   *
   *
   */
  @RequestMapping(value = "/some.do")
  public ModelAndView dosome(){ //doGet（）-- service请求处理
    // 处理some.do请求了，相当于从service调用处理完成了

    ModelAndView mv = new ModelAndView();
    //添加数据,框架在请求的最后把数据放到request作用域。
    //相当于request.setAttribute("msg","欢迎使用的springmvc做web开发")
    mv.addObject("msg","欢迎使用springmvc做web开发");
    mv.addObject("fun","执行的是dosome方法");

    //指定视图,指定视图的完整路径
    //框架对视图的forward操作，相当于request.getRequestDispather("/show.jsp).forward(...)
    mv.setViewName("/show.jsp");

    //返回mv
    return mv;
  }
}
