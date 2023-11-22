/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.ejercicios.servlet;

import com.ejercicios.logica.Controladora;
import com.ejercicios.logica.Partido;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author enriquevoza
 */
@WebServlet(name = "partidoSv", urlPatterns = {"/partidoSv"})
public class partidoSv extends HttpServlet {
    
    Controladora control = new Controladora();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet partidoSv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet partidoSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Partido> partidos = control.mostrarPartidos();
        partidos.forEach(e -> System.out.println(e.toString()));

        request.setAttribute("resultado", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fechaStr = request.getParameter("fecha");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);
        Long equipo1 = Long.valueOf(request.getParameter("nombre1"));
        Long equipo2 = Long.valueOf(request.getParameter("nombre2"));
        int puntos1 = Integer.parseInt(request.getParameter("puntos1"));
        int puntos2 = Integer.parseInt(request.getParameter("puntos2"));
        Partido partido = new Partido();

        partido.setFecha(fecha);
        partido.setResultado1(puntos1);
        partido.setResultado2(puntos2);
        control.añadirPartido(partido, equipo1, equipo2);
        response.sendRedirect("index.jsp");
        
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
