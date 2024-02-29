<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<h5 class="text-white h4">X-workz</h5>

		<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a class="btn btn-primary"
					href="index.jsp" role="button">Home</a></li>

			</ol>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a class="btn btn-primary"
					href="SongSucess.jsp" role="button">Success</a></li>

			</ol>
		</nav>
	</nav>
	<h3>Song Information!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<span style="color: red"> <c:forEach var="objectErrors"
			items="${error}">
			${objectErrors.defaultMessage}<br>
		</c:forEach>
	</span>

	<form action="dance" method="post"
		class="p-3 mb-2 bg-secondary text-white">
		SongName: <input type="text" class="form-control" name="songName"
			placeholder="SongName" value="${dto.getSongName()}" /> <br>
		<br> SingerName: <input type="text" class="form-control"
			name="singerName" placeholder="SingerName"
			value="${dto.getSingerName()}" /><br>
		<br> Composer:<input type="text" class="form-control"
			name="composer" placeholder="Composer" value="${dto.getComposer()}" /><br>
		<br> Duration:<input type="number" class="form-control"
			name="duration" placeholder="Duration" value="${dto.getDuration()}" /><br>
		<br> Album:<input type="text" class="form-control" name="album"
			placeholder="Album" value="${dto.getAlbum()}" /><br>
		<br> Lang:<input type="text" class="form-control" name="lang"
			placeholder="Lang" value="${dto.getLang()}" /><br>
		<br> ReleaseDate:<input type="date" class="form-control"
			name="releaseDate" placeholder="ReleaseDate"
			value="${dto.getReleaseDate()}" /><br>
		<br> Lyricist:<input type="text" class="form-control"
			name="lyrisistName" placeholder="Lyricist"
			value="${dto.getLyrisistName()}" /><br>
		<br> Producer:<input type="text" class="form-control"
			name="producerName" placeholder="Producer"
			value="${dto.getProducerName()}" /><br>
		<br> Director:<input type="text" class="form-control"
			name="directorName" placeholder="Director"
			value="${dto.getDirectorName()}" /><br>
		<br> <input type="submit" id="button" value="save"
			class="btn btn-success" />

	</form>

</body>
</html>