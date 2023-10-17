<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar" style="background-color: black; color: white">
		<h2>X-workz</h2>
		<button type="submit">
			<a href="MatchSuccess.jsp">MatchSuccess</a>
		</button>

	</nav>

	<form action="cricket" method="post"
		class="p-3 mb-2 bg-secondary text-white"
		onclick="return validateForm()">


		<h1>Match Information</h1>
		<span id="valid" style="padding-left: 80px"></span>
		<p id="tName" />
		<div>
			Tournament Name : <input type="text" placeholder="tournamentName"
				name="name" onchange="handleName()" id="name" area-required="true" />
		</div>
		<br>
		<p id="hCountry" />
		<div>
			Hosting Country : <input type="text" placeholder="country"
				name="country" onchange="handleCountry()" id="country"
				area-required="true" />
		</div>
		<br>
		<p id="mDate" />
		<div>
			Match Date : <input type="number" placeholder="date" name="date"
				onchange="handleDate()" id="date" />
		</div>
		<br>
		<p id="teamOne" />
		<div>
			Team 1 : <input type="text" placeholder="team1" name="team1"
				onchange="handleTeam1()" id="team1" />
		</div>
		<br>
		<p id="teamTwo" />
		<div>
			Team 2 : <input type="text" placeholder="team2" name="team2"
				onchange="handleTeam2()" id="team2" />
		</div>
		<br>
		<p id="c1Name" />
		<div>
			Team 1 Captain Name : <input type="text" placeholder="team1 CName"
				name="team1CName" onchange="handleTeam1CName()" id="team1CName" />
		</div>
		<br>
		<p id="c2Name" />
		<div>
			Team 2 Captain Name : <input type="text" placeholder="team2 CName"
				name="team2CName" onchange="handleTeam2CName()" id="team2CName" />
		</div>
		<br>
		<p id="uName" />
		<div>
			Umpire Name : <input type="text" placeholder="umpireName"
				name="umpireName" onchange="handleUmpireName()" id="umpireName" />
		</div>
		<br>
		<p id="sName" />
		<div>
			Stadium Name : <input type="text" placeholder="stadiumName"
				name="stadiumName" onchange="handleStadiumName()" id="stadiumName" />
		</div>
		<br>
		<p id="tUName" />
		<div>
			Third Umpire Name : <input type="text" placeholder="thirdUmpireName"
				name="thirdUmpireName" onchange="handleThirdUmpireName()"
				id="thirdUmpireName" />
		</div>
		<br>
		<p id="sCapacity" />
		<div>
			Stadium Capacity : <input type="number"
				placeholder="stadium capacity" name="stadiumCapacity"
				onchange="handleStadiumCapacity()" id="stadiumCapacity" />
		</div>
		<br> <input type="submit" value="Submit" class="btn btn-success"
			id="button" /> </span>
	</form>

	<script type="text/javascript">
		function handleName(event) {
			var name = document.getElementById("name");
			console.log(name.value)
			var button = document.getElementById("button");
			if (name.value.length >= 3 && name.value.length < 30) {
				document.getElementById("tName").innerHTML = "<span style='color:blue'>Tournament name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("tName").innerHTML = "<span style='color:red'>Please enter Valid Tournament name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleCountry(event) {
			var country = document.getElementById("country");
			console.log(country.value)
			var button = document.getElementById("button");
			if (country.value.length >= 3 && country.value.length < 30) {
				document.getElementById("hCountry").innerHTML = "<span style='color:blue'>Country is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("hCountry").innerHTML = "<span style='color:red'>Please enter Valid country</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleDate(event) {
			var date = document.getElementById("date");
			console.log(date.value)
			var button = document.getElementById("button");
			if (date.value > 0 && date.value <= 31) {
				document.getElementById("mDate").innerHTML = "<span style='color:blue'>Date is valid</span>";
				button.removeAttribute("disabled");
			} else {

				document.getElementById("mDate").innerHTML = "<span style='color:red'>Please enter valid date</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam1(event) {
			var team1 = document.getElementById("team1");
			console.log(team1.value)
			var button = document.getElementById("button");
			if (team1.value.length >= 3 && team1.value.length < 30) {
				document.getElementById("teamOne").innerHTML = "<span style='color:blue'>Team1 name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("teamOne").innerHTML = "<span style='color:red'>Please enter Valid Team1 name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam2(event) {
			var team2 = document.getElementById("team2");
			console.log(team2.value)
			var button = document.getElementById("button");
			if (team2.value.length >= 3 && team2.value.length < 30) {
				document.getElementById("teamTwo").innerHTML = "<span style='color:blue'>Team2 name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("teamTwo").innerHTML = "<span style='color:red'>Please enter Valid Team2 name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam1CName(event) {
			var team1CName = document.getElementById("team1CName");
			console.log(team1CName.value)
			var button = document.getElementById("button");
			if (team1CName.value.length >= 3 && team1CName.value.length < 30) {
				document.getElementById("c1Name").innerHTML = "<span style='color:blue'>Team1 captain name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("c1Name").innerHTML = "<span style='color:red'>Please enter Valid Team1 captain name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleTeam2CName(event) {
			var team2CName = document.getElementById("team2CName");
			console.log(team2CName.value)
			var button = document.getElementById("button");
			if (team2CName.value.length >= 3 && team2CName.value.length < 30) {
				document.getElementById("c2Name").innerHTML = "<span style='color:blue'>Team2 captain name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("c2Name").innerHTML = "<span style='color:red'>Please enter Valid Team2 captain name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleUmpireName(event) {
			var umpireName = document.getElementById("umpireName");
			console.log(umpireName.value)
			var button = document.getElementById("button");
			if (umpireName.value.length >= 3 && umpireName.value.length < 30) {
				document.getElementById("uName").innerHTML = "<span style='color:blue'>Umpire name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("uName").innerHTML = "<span style='color:red'>Please enter Valid Umpire name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleStadiumName(event) {
			var stadiumName = document.getElementById("stadiumName");
			console.log(stadiumName.value)
			var button = document.getElementById("button");
			if (stadiumName.value.length >= 3 && stadiumName.value.length < 30) {
				document.getElementById("sName").innerHTML = "<span style='color:blue'>Stadium name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("sName").innerHTML = "<span style='color:red'>Please enter Valid Stadium name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleThirdUmpireName(event) {
			var thirdUmpireName = document.getElementById("thirdUmpireName");
			console.log(thirdUmpireName.value)
			var button = document.getElementById("button");
			if (thirdUmpireName.value.length >= 3
					&& thirdUmpireName.value.length < 30) {
				document.getElementById("tUName").innerHTML = "<span style='color:blue'>Third umpire name is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("tUName").innerHTML = "<span style='color:red'>Please enter Valid third umpire name</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleStadiumCapacity(event) {
			var stadiumCapacity = document.getElementById("stadiumCapacity");
			console.log(stadiumCapacity.value)
			var button = document.getElementById("button");
			if (stadiumCapacity.value > 0 && stadiumCapacity.value <= 150000) {
				document.getElementById("sCapacity").innerHTML = "<span style='color:blue'>Stadium capacity is valid</span>";
				button.removeAttribute("disabled");
			} else {

				document.getElementById("sCapacity").innerHTML = "<span style='color:red'>Please enter valid Stadium capacity</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function validateForm() {
			var name = document.getElementById("name").value;
			var country = document.getElementById("country").value;
			var date = document.getElementById("date").value;
			var team1 = document.getElementById("team1").value;
			var team2 = document.getElementById("team2").value;
			var team1CName = document.getElementById("team1CName").value;
			var team2CName = document.getElementById("team2CName").value;
			var umpireName = document.getElementById("umpireName").value;
			var stadiumName = document.getElementById("stadiumName").value;
			var thirdUmpireName = document.getElementById("thirdUmpireName").value;
			var stadiumCapacity = document.getElementById("stadiumCapacity").value;
			var button = document.getElementById("button");
			if (name.length >= 3 && name.length < 30 && country.length >= 3 && country.length < 30 && date > 0 && date <= 31 && team1.length >= 3 && 
					team1.length < 30 && team2.length >= 3 && team2.length < 30 && team1CName.length >= 3 && team1CName.length < 30 && team2CName.length >= 3
					&& team2CName.length < 30 && umpireName.length >= 3 && umpireName.length < 30 && stadiumName.length >= 3 && stadiumName.length < 30 && 
					thirdUmpireName.length >= 3 && thirdUmpireName.length < 30 && stadiumCapacity > 0 && stadiumCapacity < 150000) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Information valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter Valid valid Information</span>";
				button.setAttribute("disabled", "");

			}
		}
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
		integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
		crossorigin="anonymous"></script>
</body>
</html>