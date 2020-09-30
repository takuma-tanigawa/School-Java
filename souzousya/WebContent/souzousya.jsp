<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
	ArrayList<String> couseNames = new ArrayList<>();
	couseNames.add("0");
	couseNames.add("1");
	couseNames.add("2");
	couseNames.add("3");
	String[] courses = {"Javaプログラミング","Webプログラミング","Webクリエーター","グラフィック"};
	int[] couseName = new int[4];
	for(int i = 0; i < 4; i++){
		int randam = new java.util.Random().nextInt(couseNames.size());
		couseName[i] = Integer.parseInt(couseNames.get(randam));
		couseNames.remove(randam);
	}

	int forcast = new java.util.Random().nextInt(10);
	String wether;
	String img1;
	String img2;
	if((forcast % 2) == 0){
		wether = "今日は晴れです";
		img1 = "forcast/fine.jpg";
		img2 = "晴れ";
	}else {
		wether = "今日は雨です";
		img1 = "forcast/rain.jpg";
		img2 = "雨";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>コース案内</title>
</head>
<body>
<h1>創造社リカレントスクール　コース案内</h1>
<table border="1">
	<thead>
		<tr>
			<th>course</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><%= courses[couseName[0]]%></td>
		</tr>
		<tr>
			<td><%= courses[couseName[1]]%></td>
		</tr>
		<tr>
			<td><%= courses[couseName[2]]%></td>
		</tr>
		<tr>
			<td><%= courses[couseName[3]]%></td>
		</tr>
	</tbody>
</table>
	<ul>
		<li><%= courses[couseName[0]]%></li>
		<li><%= courses[couseName[1]]%></li>
		<li><%= courses[couseName[2]]%></li>
		<li><%= courses[couseName[3]]%></li>
	</ul>

<p><%= wether%></p>
<img src="<%= img1%>" alt="<%= img2%>" />
</body>
</html>