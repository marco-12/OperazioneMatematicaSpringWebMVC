<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scelta Metodi</title>
</head>
<body>

	<h2>Benvenuto!</h2>
	<br>
	<h4>Scegli il tipo di operazione matematica che vuoi fare</h4>
	<br>


	<form action="inserisciNumeri" method="post">
		<select size="1" class="select" style="width: 25%" name="scelta"
			id="nome">

			<option value="somma">Somma</option>
			<option value="sottrazione">Sottrazione</option>
			<option value="moltiplicazione">Moltiplicazione</option>
			<option value="divisione">Divisione</option>

		</select><br> <input type="submit" name="azione" value="Invio">
	</form>
</body>
</html>