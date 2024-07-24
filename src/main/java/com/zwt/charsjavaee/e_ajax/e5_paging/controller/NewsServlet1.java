package com.zwt.charsjavaee.e_ajax.e5_paging.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zwt.charsjavaee.e_ajax.e5_paging.chars.News;
import com.zwt.charsjavaee.e_ajax.e5_paging.service.NewsService;
import com.zwt.charsjavaee.e_ajax.e5_paging.service.impl.NewsServiceImpl;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/newsServlet1")
public class NewsServlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String start = req.getParameter("start");
        String pageSize = req.getParameter("pageSize");

        NewsService service = new NewsServiceImpl();
        PageInfo<List<News>> listPageInfo = service.pagingQuery(Integer.parseInt(start), Integer.parseInt(pageSize));

        String json = new ObjectMapper().writeValueAsString(listPageInfo);
        resp.getWriter().write(json);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req,resp);
    }
}
