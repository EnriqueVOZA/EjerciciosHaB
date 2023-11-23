<%-- 
    Document   : index
    Created on : 22 nov 2023, 12:35:07
    Author     : enriquevoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Start Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Votación</h1>
        
        <h2>Elija su voto:</h2>
        <form action="votoSv" method="POST">
        <label>
            <input type="radio" name="partido" value="partidoA" > Partido A
        </label>  
        <br>
        <br>
        <label>
            <input type="radio" name="partido" value="partidoB" > Partido B
        </label>
        <br>
        <br>
        <label>
            <input type="radio" name="partido" value="partidoC"> Partido C
        </label>   
        <br>
        <br>
        <button type="submit">Enviar</button>
        </form>
    </body>
</html>