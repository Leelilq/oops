package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utli.jdbcU;

/**
 * Servlet implementation class dl
 */
@WebServlet("/dl")
public class dl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public dl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("a");
		String pwd=request.getParameter("b");
		
		jdbcU jdbc=new jdbcU();
		Connection conn=jdbc.getconn();
		
		String sql="select * from emplyy where name=? and pwd=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				request.setAttribute("结果", "登录成功");
				request.getRequestDispatcher("jieguo.jsp").forward(request, response);
			}else{
				request.setAttribute("结果", "登录失败");
				request.getRequestDispatcher("jieguo.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
