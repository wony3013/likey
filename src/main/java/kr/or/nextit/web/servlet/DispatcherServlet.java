package kr.or.nextit.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.nextit.web.handler.UrlHandlerMapping;

@WebServlet(urlPatterns="/likey")
public class DispatcherServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		
		String contextConfigLocation = getInitParameter("contextConfigLocation");
		String configFilePath = getServletContext().getRealPath(contextConfigLocation);
		
		try {
			UrlHandlerMapping.init(configFilePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.setCharacterEncoding("utf-8");
		
		// 커맨드 패턴 === abc.do/?cmd=XXX
		// URL 패턴 === XXXX.do/ 			<---- 이방식이 좋음 ㅇㅇ 
		String uri = request.getRequestURI();
		
		
		if(uri.indexOf(request.getContextPath()) == 0) {
			uri = uri.substring(request.getContextPath().length());
		}
		
		System.out.println("요청 URI : " + uri);
		// /webmvc/member/memberList.do
		
		String viewPage = "";
		try {
			
			Controller controller = UrlHandlerMapping.getHandler(uri);
			
			if(controller != null) {
				viewPage = controller.process(request, response);
				
				if(viewPage != null) {
					
					if(viewPage.startsWith("redirect:")) {
						viewPage = viewPage.substring("redirect:".length());
						response.sendRedirect(request.getContextPath() + viewPage);
					} else {
						RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/" + viewPage + ".jsp");
						dispatcher.forward(request, response);											
					}
					
				}
				
			} else {
				// 404 에러
				response.setStatus(HttpServletResponse.SC_NOT_FOUND);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		
	}
	
}
