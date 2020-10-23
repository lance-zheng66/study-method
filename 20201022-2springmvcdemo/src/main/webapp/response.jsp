<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>

    <script>
      //页面加载，绑定单击事件
      $(function () {
        $("#btn").click(function () {
          //alert("hello btn");
          $.ajax({
            //编写json格式，设置属性和值
            url: "user/testAjax",
            contentType: "application/js;charset=utf-8",
            data:'{"name":"hehe","password":"123","age":"23"}',
            dataType:"jasn",
            type:"post",
            success:function (data) {
                //data值服务器响应的json的内容，进行解析
            }
          })
        });
      });
    </script>

</head>
<body>

<a href="user/testString">testString</a>
<br>

<a href="user/testVoid">testVoid</a>
<br/>

<a href="user/testModelAndView">testModelAndView</a>
<br/>


<a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
<br/>

<button id="btn">发送ajax的请求</button>

</body>
</html>
