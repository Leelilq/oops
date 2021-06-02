package Servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取login.jsp页面的form表单的数据
		String name = request.getParameter("userName");
		String pwd = request.getParameter("userPwd");
		//登陆提示语句
		String info = "账号或密码错误！";
		
		//判断账号或密码是否正确
		if (name.equals("aaa")) {
			if (pwd.equals("123")) {
				//登陆成功更新提示语句
				info = "登陆成功！";
				//提示语句以键值对的方式存储
				request.setAttribute("登陆结果",info);
				//跳转到result.jsp页面
				request.getRequestDispatcher("result.jsp").forward(request, response);
			} else {
				request.setAttribute("登陆结果",info);
				request.getRequestDispatcher("result.jsp").forward(request, response);

			}
		} else {
			request.setAttribute("登陆结果",info);
			request.getRequestDispatcher("result.jsp").forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
