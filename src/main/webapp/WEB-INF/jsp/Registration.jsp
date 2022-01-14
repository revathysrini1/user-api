<html>
	<head>
		
		<script lang="javascript">
		
	
			
			function setPersonInfo(){
				var firstNameTxt = document.getElementById("fname").value;
				var lastNameTxt = document.getElementById("lname").value;
				var emailTxt = document.getElementById("id").value;
				
				var postData = 'fname=' + firstNameTxt;
				postData += '&lname=' + lastNameTxt;
				postData += '&id=' + emailTxt;
				
				var ajaxRequest = new XMLHttpRequest();
				ajaxRequest.open('POST', 'http://localhost:9005/UpsertUser/');
				ajaxRequest.setRequestHeader("Content-type", "application/JSON");
				ajaxRequest.send(postData);
			}
		
			
		
		</script>
	</head>
	<body>
		<h1>Registration Details</h1>
		<div id="error"></div>
		<form method="post">
			<p>First Name : <input type="text" name="firstName" id="fname"/></p>
			<p>LastName : <input type="text" name="lastName" id="lname"/></p>
			<p>Email Id : <input type="text" name="Email" id="id"/></p>
			<input type="button" value="Add User" onclick="setPersonInfo()" />
		</form>
		
	</body>
</html>
