package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletTest.model.UserModel;

/**
 * 一个简单的servlet，这是一个功能类
 * 
 * @author 涂宗勋
 * @date 2018年12月26日
 */
public class MyServlet extends HttpServlet {

	/**
	 * get类型的http请求会走这里，内部实际又调用了doPost的逻辑
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * post类型的http请求会走这里
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserModel userModel = new UserModel();
		// 告诉客户端响应数据的类型以及字符集编码等，字符集指定保证前台显示不乱码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println(userModel.toString());
	}

}
