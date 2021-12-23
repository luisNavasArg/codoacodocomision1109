<%-- 
    Document   : index
    Created on : 2 dic. 2021, 10:47:39
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <h1>Bienvenid@s a Escuela Digital!</h1>
        <div class="container">
            <div class="row d-flex justify-content-center">
                <form class="p-5 w-50" action="AlumnosController?accion=ingresar" method="POST">
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="text" class="form-control" id="email" name="email" />
                    </div>
                    <div class="mb-3">
                        <label for="pass" class="form-label">Clave</label>
                        <input type="text" class="form-control" id="pass" name="pass" />
                    </div>
                    <input type="submit" class="btn btn-primary" value="Ingresar"/>
                </form>
            </div>
        </div>
    </body>
</html>
