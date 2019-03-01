package com.java;

public class LoginFilter implements Filter
{
	/* This is filter class which is called before servlet 
	 * in this method user name and password is fetch entered by user on web page and 
	 * passed to dao class to check details in database  
	 * (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException
	{
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		LoginDao dao = new LoginDao();
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  	
	    //fetching data using http request
	    String name=request.getParameter("userName");  
	    String password=request.getParameter("password"); 
	    //Cookie is created to store user details for small amount of time
	    Cookie cookie1 = new Cookie("userName",name);
	    Cookie cookie2 = new Cookie("password",password);
	   
	    try {
			if(dao.checkDetails(name, password,"User"))		//check entered details is valid or not
			{ 												//if it is valid forward to user welcome page 
				HttpSession session = req.getSession();
				session.setAttribute("uname", name);
				res.addCookie(cookie1);
				res.addCookie(cookie2);
			    RequestDispatcher rd=request.getRequestDispatcher("/User.jsp");  
			    rd.forward(request, response);  
			}  
			else if(dao.checkDetails(name, password,"Admin"))	//check entered details is valid or not
			{ 												//if it is valid forward to admin welcome page
				HttpSession session = req.getSession();
				session.setAttribute("uname", name);
				res.addCookie(cookie1);
				res.addCookie(cookie2);
			    RequestDispatcher rd=request.getRequestDispatcher("/Admin.jsp");  
			    rd.forward(request, response);  
			}
			else
			{   
				//if invalid data is entered user will remain on index page only
			    RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			    rd.include(request, response);
			    out.print("Authentication Error"); 			                  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  
	}
}
