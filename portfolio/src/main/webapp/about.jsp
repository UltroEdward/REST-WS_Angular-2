<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>MeAsQA</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="css/business-casual.css" rel="stylesheet">
<link href="css/css.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
</head>

<body>

	<!--Here will be inserted header with nav bar  -->
	<%@ include file="template/header.html"%>

	<!-- About me, main apart -->
	<div class="container">
		<div class="row">
			<div class="box" style="background: #fff; padding: 10px">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						About <strong>me</strong>
					</h2>
					<hr>
				</div>

				<div class="col-md-4">
					<!-- img class="img-responsive img-border-left" src="img/slide-2.jpg" alt="">-->
					<div class="row">
						<div class="box" style="padding: 20px; padding-bottom: 5px">
							<div class="col-lg-12 text-center">
								<div id="carousel-example-generic" class="carousel slide">
									<!-- Indicators -->
									<ol class="carousel-indicators hidden-xs">
										<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
										<li data-target="#carousel-example-generic" data-slide-to="1"></li>
										<li data-target="#carousel-example-generic" data-slide-to="2"></li>
									</ol>
									<!-- Wrapper for slides -->
									<div class="carousel-inner">
										<div class="item active">
											<img class="img-responsive img-full" src="img/avatar.jpg" alt="">
										</div>
										<div class="item">
											<img class="img-responsive img-full" src="img/avatar1.jpg" alt="">
										</div>
										<div class="item">
											<img class="img-responsive img-full" src="img/avatar2.jpg" alt="">
										</div>
									</div>
									<!-- Controls -->
									<a class="left carousel-control" href="#carousel-example-generic" data-slide="prev"> <span
										class="icon-prev"></span>
									</a> <a class="right carousel-control" href="#carousel-example-generic" data-slide="next"> <span
										class="icon-next"></span>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-md-8">
					<h1>Senior QA Automation</h1>
					<h2>Expert: Java, UI/API automation, testing</h2>
					<h3>Age: 26 years-old</h3>
					<h3>Location: Belarus, Minsk</h3>
					<hr>
					<div class="contacts" style="margin-top: 10px;">
						<h3>Contacts:</h3>
						<h4>Email: edvardloktev@gmail.com</h4>
					</div>
				</div>

				<div class="clearfix"></div>
			</div>
		</div>
	</div>

	<!-- About me, professional summary-->
	<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						<strong>Summary</strong>
					</h2>
					<hr>
				</div>
				
				<div class="col-lg-12 text-center">
					<ul style="text-align: left">
						<li>Experienced Senior Software Test Automation Engineer with technical background and hands-on experience in
							IT industry.</li>
						<li>Core professional expertise covers: UI automation (Selenium Web Driver, Java, XPath/CSS locator) Back-end
							automation (REST, SOAP) Functional manual testing experience and test automation experience (Java) Comfortable
							with developing automation framework from scratch, working with legacy code and refactoring of existing
							automation frameworks Responsible, industrious and reliable person with good communication and troubleshooting
							skills Well organized, flexible and accurate, always aim at the result and self-development; able to work in a
							team and individually</li>
					</ul>

					<ul style="text-align: left">
						<li>Java (Oracle Certified Associate Java SE 7 Programmer): Apache POI/HTTP/Tomcat, Hibernate, Java Beans,
							JSP, Servlets, JDBC, Jersey</li>
						<li>Front-end: Bootstrap, HTML, CSS, JS(limited)</li>
						<li>QA Java tools: Selenium WebDriver, Rest-assured, AssertJ, TestNG</li>
						<li>Software Construction: Bash, Regular Expressions, SQL, XPath/CSSPath, JsonPath</li>
						<li>CI/Build tools/Version Control Systems: Jenkins, Maven/Gradle, Git/Subversion</li>
						<li>Other Tools and Methods: MS Office, Oracle VirtualBox, PuTTY, Toad, Fiddler
						<li>Software Engineering Management: JetBrains YouTrack, Rally, Jira • Technical Writing: Writing Technical
							Documentation (English) Some</li>
					</ul>
				</div>

				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						<strong>Education</strong>
					</h2>
					<hr>
					<ul style="text-align: left">
						<li>Economics, Banking 2007-2012 in <a href="http://www.bseu.by/english" target="_blank">Belarus State Economic University</a></li>
						<li>SQL 2012 in <a href="http://www.st.by/en/" target="_blank">System Technologies</a></li>
						<li>Information Technology 2013-2015 in <a href="http://en.bntu.by" target="_blank">Belarusian National Technical University</a></li>
						<li>JAVA EE 2015 in <a href="http://www.belhard.com/en" target="_blank">BelHard</a></li>
						<li>Certificate Oracle Java SE 7 Programmer I 2016 in <a href="www.oracle.com" target="_blank">Oracle</a></li>
						<li>Python 2016 in <a href="http://www.belhard.com/en" target="_blank">BelHard</a></li>
					</ul>
				</div>

				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center social">
						<a href="https://github.com/UltroEdward " target="_blank">
							<i class="fa fa-github" aria-hidden="true"></i>
						 </a>
						<a href="https://www.linkedin.com/in/eduard-loktev-ab572280" target="_blank">
							<i class="fa fa-linkedin" aria-hidden="true"></i>
						</a>
					</h2>
					<hr>
				</div>

			</div>
		</div>
	</div>


	<!-- Experience block -->
	<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-lg-12">
					<hr>
					<h2 class="intro-text text-center">
						<strong>Experience</strong>
					</h2>
					<hr>
				</div>

				<!-- Experience items will be added here -->
				<div class="job-container"></div>
			</div>
		</div>
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/mustache.js/2.2.1/mustache.js"></script>
	<script src="js/companies.js"></script>
</body>
</html>