<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>讀取螢幕大小</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<body>

	<div>
		<span>目前螢幕大小：</span> <span id="screenWidth"></span> * <span id="screenHeight"></span>
	</div>
	<script type="text/javascript">
		$(window).load(function() {
			var winWidth = 0;
			var winHeight = 0;
			function findScreenSize() {
				if (window.innerWidth) {
					winWidth = window.innerWidth;
				} else if ((document.body) && (document.body.clinetWidth)) {
					winWidth = document.body.clinetWidth;
				}

				if (window.innerHeight) {
					winHeight = window.innerHeight;
				} else if ((document.body) && (document.body.clientHeight)) {
					winHeight = document.body.clientHeight;
				}

				if (document.documentElement && document.documentElement.clientHeight && document.documentElement.clientWidth) {
					winWidth = document.documentElement.clientWidth;
					winHeight = document.documentElement.clientHeight;
				}

				$("#screenWidth").text("" + winWidth);
				$("#screenHeight").text("" + winHeight);
			}

			findScreenSize();
			window.onresize = findScreenSize;

		}(jQuery));
	</script>
</body>
</html>