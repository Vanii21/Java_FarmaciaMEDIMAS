<%-- 
    Document   : index
    Created on : 2/11/2023, 06:58:36 PM
    Author     : Alcan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>MIDEMAS</title>
        <link href="css/styleIndex.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/x-icon" href="img/Logo.png">
    </head>
    <body>
        <div class="loggin">
            <img src="img/Logo.png" alt="" width="50%">
            <form action="Controlador" method="POST">
                <label class="titleFarmacia">FARMACIA MIDEMAS</label><br>
                <label class="etiquetaFarmacia"><span class="text-nomb">Ingresar ID:</span></label>
                <input type="text" name="txtID"><br>
                <input type="submit"><br>
            </form>
        </div>
    </body>
</html>
