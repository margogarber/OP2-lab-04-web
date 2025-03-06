package controller;

import model.Database;
import model.Film;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/film-details")
public class FilmDetailsServlet extends HttpServlet {
    private Database database = Database.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filmTitle = request.getParameter("title");
        Film film = database.findFilmByTitle(filmTitle);

        if (film == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Фільм не знайдено");
            return;
        }

        request.setAttribute("film", film);
        request.getRequestDispatcher("/pages/filmDetails.jsp").forward(request, response);
    }
}
