package pl.sdacademy.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static pl.sdacademy.servlet.CatParams.*;


public class CatServlet extends HttpServlet {

    private CatRepository catRepository;

    public CatServlet(CatRepository catRepository) {
        this.catRepository = catRepository;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        catRepository.save(new Cat
                (req.getParameter(RASA),
                 req.getParameter(IMIE),
                 req.getParameter(WLASCICIEL)));
        resp.sendRedirect("/cats");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Cat> cats;
        String raceFilter = req.getParameter("find");
        if(raceFilter != null && !raceFilter.isEmpty() ) {
            cats = catRepository.findByRase(raceFilter);
        } else {
                    cats = catRepository.findAll();
                }


        req.setAttribute(CatModelAttributes.ALL_CATS, cats);
        req.getRequestDispatcher("/form.jsp").forward(req, resp);
    }

}
