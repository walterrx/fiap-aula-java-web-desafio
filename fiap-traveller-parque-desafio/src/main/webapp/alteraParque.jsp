<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/fiap-traveller-parque-desafio/alteraParque" method="post" >


Nome: <input type="text" name="nome" value="${parque.nome}"/>
<input type="hidden" name="id" value="${parque.id}" />
<input type="submit" />
</form>

</body>
</html>