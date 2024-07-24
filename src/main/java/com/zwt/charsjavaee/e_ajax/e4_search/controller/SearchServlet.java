package com.zwt.charsjavaee.e_ajax.e4_search.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zwt.charsjavaee.e_ajax.e1_native_js.UserServlet;
import com.zwt.charsjavaee.e_ajax.e4_search.chars.User;
import com.zwt.charsjavaee.e_ajax.e4_search.service.SearchService;
import com.zwt.charsjavaee.e_ajax.e4_search.service.impl.SearchServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "/searchServlet", value = "/searchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);

        String userName = req.getParameter("userName");
        SearchService service = new SearchServiceImpl();
        List<User> users = service.searchLike(userName);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(users);
        resp.getWriter().write(json);
    }
}
