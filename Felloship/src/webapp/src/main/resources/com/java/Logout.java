package com.java;

public class Logout extends HttpServlet
{
	/* This method is call when user clicked on logout button, and after logout it will return back
	 * to index page  
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, 
	 * javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		session.removeAttribute("uname");
		session.invalidate();
		response.sendRedirect("index.jsp");	
	}
}
