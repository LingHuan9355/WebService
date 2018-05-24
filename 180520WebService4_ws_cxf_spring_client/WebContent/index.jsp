<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
			<title>Insert title here</title>
			<script type="text/javascript" src="jquery-1.7.2.js"></script>
			<script type="text/javascript">

			$(function(){
				
				$("#btn").click(function(){ //回调函数
					alert("---");
					var name = document.getElementById("name").value;
					//var data = '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:sayHello xmlns:ns2="http://ws.ws.hr.com/"><arg0>' + name + '</arg0></ns2:sayHello></soap:Body></soap:Envelope>';
					var data ='<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Header><hr><name>carlling</name><password>admin1008</password></hr></soap:Header><soap:Body><ns2:getOrderById xmlns:ns2="http://ws.ws.hr.com/"><arg0>25</arg0></ns2:getOrderById></soap:Body></soap:Envelope>';
				    alert(data);
		/* 			 $.post(
				    		"http://192.168.0.101:8888/180515WebService3_ws_cxf/datatypews",
				    		data,
				    		function(msg){
				    			var $Result = $(msg);
				    		    var value = $Result.find("return").text();
				    		    alert(value);
				    		},
				    		"xml"
				    );  */

					 $.ajax({
						type : "post",
						url : "http://localhost:8080/180520WebService4_ws_cxf_spring/orderws",
						data : data,
						success : function(msg){
							alert("------");
							var $Result = $(msg);
							var value = $Result.find("return").text();
							alert(value);
						},
						error : function(msg) {
							//alert("-----"+msg);
						},
						dataType : "xml"
					}); 
				    
				});
				
			});
			
			function reqWebService(){
               var name = document.getElementById("name").value;
              // alert(name);
				var data = '<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"><soap:Body><ns2:sayHello xmlns:ns2="http://ws.ws.hr.com/"><arg0>' + name + '</arg0></ns2:sayHello></soap:Body></soap:Envelope>';
				//1.XMLHttpRequest对象
				var request = getRequest();
				//2.设置回调函数
				request.onreadystatechange  = function(){
					if(request.readyState == 4 && request.status ==200){
						var result = request.responseXML;
						//alert(result);
						var returnEle = result.getElementsByTagName("return")[0];
					    var value = returnEle.firstChild.data;
					    alert(value);
					}
				};
				//3.打开连接
				request.open("POST","http://192.168.0.101:8888/180515WebService3_ws_cxf/datatypews");
				//4.设置请求头
				request.setRequestHeader("Content-type","");
			    //5.发送请求，将data作为请求体fas
				request.send(data);
			}

			function getRequest() {
				var xmlHttp = null;
				try {
					// Firefox, Opera 8.0+, Safari  chrome
					xmlHttp = new XMLHttpRequest();
				} catch (e) {
					// Internet Explorer
					try {
						xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
					} catch (e) {
						xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
					}
				}
				return xmlHttp;
			} 
</script>

</head>
<body>
       用户名:
	<input id="name" name="username" value="" />
	<br>
	<button onclick="reqWebService()">AJax请求webservice</button>
	<br><br>
	<button id="btn">Jquery请求webservice</button>
</body>
</html>