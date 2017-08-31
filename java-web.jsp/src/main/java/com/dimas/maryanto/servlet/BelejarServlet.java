package com.dimas.maryanto.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/nasabah/proses", name = "servletNasabah")
public class BelejarServlet extends HttpServlet {

    private static List<Nasabah> listOfNasabah = new ArrayList<>();

    public class Nasabah {

        public Nasabah() {
        }

        public Nasabah(String id, String nama) {
            this.id = id;
            this.nama = nama;
        }

        private String id;
        private String nama;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("halo", "HI i'm from Servlet");
        req.setAttribute("listOfNasabah", listOfNasabah);
        RequestDispatcher rd = req.getRequestDispatcher("/nasabah/add.jsp");
        rd.forward(req, resp);
//        resp.sendRedirect(req.getContextPath() + "/nasabah/add.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String nama = req.getParameter("nama");

        Nasabah nasabah = new Nasabah(id, nama);
        listOfNasabah.add(nasabah);
//        RequestDispatcher rd = req.getRequestDispatcher("/nasabah/add.jsp");
//        rd.forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/nasabah/proses");
    }
}
