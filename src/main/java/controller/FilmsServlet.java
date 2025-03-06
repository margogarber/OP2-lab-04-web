package controller;

import model.Database;
import model.Film;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/films")
public class FilmsServlet extends HttpServlet {
    private Database database = Database.getInstance(); // Отримуємо базу даних

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Film> films = database.getFilms();
        request.setAttribute("films", films); // Передаємо список фільмів у JSP
        request.getRequestDispatcher("/pages/films.jsp").forward(request, response);
    }
}


