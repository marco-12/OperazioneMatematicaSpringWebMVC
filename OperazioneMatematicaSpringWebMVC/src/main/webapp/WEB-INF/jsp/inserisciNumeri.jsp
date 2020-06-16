<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci Numeri</title>
</head>
<body>

	<form action="risultato" method="post">
		<input type="hidden" value="${azione}" name="scelta">
		<input type="text" name="numero1" placeholder="Inserisci il primo numero">
		<input type="text" name="numero2" placeholder="Inserisci il secondo numero">
		<input type="submit" name="numeri" value="Calcola">
	</form>
</body>
</html>