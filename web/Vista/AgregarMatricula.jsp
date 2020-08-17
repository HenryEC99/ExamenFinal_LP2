<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AgregarMatricula</title>
        <link href="CSS/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <form name="AgregarMatriculaForm" action="Controlador" method="get">
                <table  class="table">
                    <thead>
                        <tr>
                            <th class="text-center" colspan="2">Agregar Matricula</th>                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="text-right">Semestre</td>
                            <td><input class="form-control" type="text" name="f_semestre" value="" maxlength="30" size="20" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Ciclo</td>
                            <td><input class="form-control" type="text" name="f_ciclo" value="" maxlength="1" size="5" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Estado</td>
                            <td><input class="form-control" type="text" name="f_estado" value="" maxlength="1" size="2" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Idcurso</td>
                            <td><input class="form-control" type="text" name="f_idcurso" value="" maxlength="1" size="2" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Idestudiante</td>
                            <td><input class="form-control" type="text" name="f_idestudiante" value="" maxlength="1" size="2" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Idcarrera</td>
                            <td><input class="form-control" type="text" name="f_idcarrera" value="" maxlength="1" size="2" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="text-center">
                                <input class="btn-primary" type="submit" value="Agregar Matricula" name="agregar" />
                                <a class="btn btn-success" href="Controlador?f_accion=listarmatricula">Regresar</a>
                                <input type="hidden" value="agregarmatricula02" name="f_accion"/>

                            </td>
                        </tr>

                    </tbody>
                </table>

            </form>
        </div>
    </body>
</html>