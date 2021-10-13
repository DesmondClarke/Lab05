package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;
import service.AccountService;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session  = request.getSession();
        User user = new User();
        
       String Username = request.getParameter("user");
       String Password = request.getParameter("pass");
       
       session.setAttribute("username", Username);
       
       Object a = request.getAttribute(Username);
       
      
       if(Username != null || Username.equals("")){
        if(Username.equals("abe") && Password.equals("password") || Username.equals("barb") && Password.equals("password")){
            //User.login(Username, Password);
           getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }else {
           getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
           request.setAttribute("invalidEntry", true);
       }
       }
       
            
    }

}
