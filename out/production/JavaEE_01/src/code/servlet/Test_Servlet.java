package code.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author:GQM
 * @Date:created in 8:46 2020/3/5
 * @Description:
 * @Modifyed_By:
 */
public class Test_Servlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("hello Servlet!!!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
