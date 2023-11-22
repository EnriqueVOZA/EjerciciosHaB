<%-- 
    Document   : index
    Created on : 22 nov 2023, 17:24:04
    Author     : enriquevoza
--%>

<%@page import="java.util.List"%>
<%@page import="com.ejercicios.logica.Controladora"%>
<%@page import="com.ejercicios.logica.Equipo"%>
<%@page import="com.ejercicios.logica.Partido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            margin: 20px;
            text-align: center;
        }

        h1 {
            color: #008080;
        }

        form, table {
            width: 60%; /* Adjust the width as needed */
            margin: auto;
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
            text-align: left;
        }

        input, button {
            width: 100%;
            box-sizing: border-box;
            margin-bottom: 10px;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        button {
            background-color: #008080;
            color: #fff;
            cursor: pointer;
        }

        table {
            border-collapse: collapse;
            margin-top: 10px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #008080;
            color: #fff;
        }

        tbody tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
    </head>
    <body>
        <h1>Registrar Equipo</h1>
        <form action="equipoSv" method="POST"> 
        <label>
            <input type="text" name="equipo" value="equipo1" > Partido A
        </label>  
                <br>
            <br>

        <br>
        <br>
        <button type="submit">Guardar</button>
        </form>
        
     <form action="equipoSv" method="GET">
        <p>Consultar equipos: </p>
        <button type="submit">Consultar</button>
    </form>
    
    
    <div>
        <% if (request.getAttribute("equipos") != null) { %>
        <h3>Resultados: </h3>
        <table>
            <thead>
                <tr>
                    <th>Nombre</th>          
                </tr>                 
            </thead>
            <tbody>
                <%for (Equipo equipo : (List<Equipo> ) request.getAttribute("equipos")) { %>
                
                <tr>
                    <td><%= equipo.getNombre()   %></td>
                </tr>
                <% } %>
                
            </tbody>
            
        </table>
        
        <% } %>
        
        
        <h1>Registrar partidos</h1>
        <form action="partidoSv" method="POST">

            <label for="fecha">Fecha:</label>
            <input type="date" class="form-control" id="fecha" name="fecha"><br>
            <label for="equipoLocal">Id equipo Local:</label>
            <input type="number" class="form-control" id="nombre1" name="nombre1"><br>
            <label for="equipoVisitante">Id equipo Visitante:</label>
            <input type="number" class="form-control" id="nombre2" name="nombre2"><br>
            <label for="puntosEq1">Puntos equipo 1:</label>
            <input type="number" class="form-control" id="puntos1" name="puntos1"><br>
            <label for="puntosEq2">Puntos equipo 2:</label>
            <input type="number" class="form-control" id="puntos2" name="puntos2">
            <br>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
        <form action="partidoSv" method="GET" accept-charset="UTF-8">
            <!-- <input type="text" class="form-control" id="consultaApellido" name="consultaApellido"> -->
            <br>
            <button type="submit" class="btn btn-primary">Mostrar partidos</button>
        </form>
        
        <div>
            <% if (request.getAttribute("resultado") != null) { %>
            <h3>Resultados:</h3>
            <table class="table" >
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Equipo Local</th>
                        <th>Equipo Visitante</th>
                        <th>Puntos Local</th>
                        <th>Puntos Visitante</th>

                    </tr>
                </thead>
                <tbody>
                    <% for (Partido partido : (List<Partido>) request.getAttribute("resultado")) {%>
                    <tr>
                        <td><%= partido.getFecha()%></td>
                        <td><%= partido.getEquipo1().getNombre()%></td>
                        <td><%= partido.getEquipo2().getNombre()%></td>
                        <td><%= partido.getResultado1()%></td>
                        <td><%= partido.getResultado2()%></td>

                    </tr>
                    <% } %>
                </tbody>
            </table>
            <% }%>
    </body>
</html>
