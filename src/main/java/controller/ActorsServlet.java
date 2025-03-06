package controller;

import model.Actor;
import model.Database;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/actors")
public class ActorsServlet extends HttpServlet {
    private Database database = Database.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Actor> actors = database.getActors();
        request.setAttribute("actors", actors);
        request.getRequestDispatcher("/pages/actors.jsp").forward(request, response);
    }
}