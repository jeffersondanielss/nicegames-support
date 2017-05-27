<%--
    Document   : TrataErro
    Created on : 22/04/2017, 13:12:05
    Author     : jefferson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                width: 80%;
                margin: 0 auto;
                text-align: center;
            }
            
            hr {
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <h1>Erro</h1>
        <div id="erro">
            Houve um erro inesperado na execução do sistema.<br>
            Favor informar ao suporte técnico.<br>
            
            <hr>
            
            <h4>Descrição do erro:</h4>
            <span><%= exception %></span> 
        </div>
        
        <hr>
        
        <form id="voltar">
            <input type="button" onclick="history.go(-1)" value="VOLTAR">
        </form>
        
    </body>
</html>
