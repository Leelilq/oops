package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Jdbc.Jdbc;

/**
 * Servlet implementation class EmpModify
 */
@WebServlet("/EmpModify")
public class EmpModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpModify() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ı���
		request.setCharacterEncoding("UTF-8");
		//���ձ���ֵ
		String id = request.getParameter("userId");
		String pwd = request.getParameter("userPwd");
		//ֵ����ת��
		int ID = Integer.parseInt(id);
		String part = request.getParameter("partName");
		//�������ݿ�
		Jdbc jdbc = new Jdbc();
		Connection conn = jdbc.getConn();
		//дsql���
		String sql = "update BankSystem set EmpPwd=?,EmpPart=? where EmpId=?,EmpPwd=?,EmpPart=?";
		//Ԥ����
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setString(2, part);
			ps.setInt(3, ID);
			int result = ps.executeUpdate();
			if (result==1) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("fail.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
