<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>產品維護</title>
<link rel="stylesheet" type="text/css" href="../style/product.css">
</head>
<body>
	<center>
		<form action="productCRUD.do">
			<table>
				<thead>
					<tr>
						<th colspan="100">產品維護</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>id：</td>
						<td colspan="10"><input type="text" name="id"></td>
						<td>${error.id}</td>
					</tr>
					<tr>
						<td>name：</td>
						<td colspan="10"><input type="text" name="name"></td>
						<td>${error.name}</td>
					</tr>
					<tr>
						<td>price：</td>
						<td colspan="10"><input type="text" name="price"></td>
						<td>${error.price}</td>
					</tr>
					<tr>
						<td>make：</td>
						<td colspan="10"><input type="text" name="make"></td>
						<td>${error.make}</td>
					</tr>
					<tr>
						<td>expire：</td>
						<td colspan="10"><input type="text" name="expire"></td>
						<td>${error.expire}</td>
					</tr>

					<tr>
						<td><input type="submit" id="prodSelectAll" name="chooseButton" value="查詢全部"></td>
						<td><input type="submit" id="prodSelectId" name="chooseButton" value="id查詢"></td>
						<td><input type="submit" id="prodInsert" name="chooseButton" value="新增產品"></td>
						<td><input type="submit" id="prodUpdate" name="chooseButton" value="更新產品"></td>
						<td><input type="submit" id="prodDelete" name="chooseButton" value="刪除產品"></td>
					</tr>

				</tbody>
			</table>


		</form>
		<hr>

	</center>
</body>
</html>