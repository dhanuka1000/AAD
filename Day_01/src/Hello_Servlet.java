import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Hello_Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("get");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet with get");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("post");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet with post");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("put");
        PrintWriter out = response.getWriter();
        out.println("Hello Servlet with put");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        System.out.println("delete");
        PrintWriter out = resp.getWriter();
        out.println("Hello Servlet with delete");
    }
}