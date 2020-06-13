<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-bootstrap-tags" prefix="sb"%>

<%@ taglib uri="/struts-jquery-tags" prefix="sj"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido</title>
<sb:head />
<sj:head />
</head>
<body>
<header>
	<img alt="Portada" src="imgs/portada.jpg" style="width:100%; height: 50%;">
</header>
<body>
	<div id="" style="margin-left: 30%; margin-right: 30%;">
		<h1>REGISTRO DE PAQUETES</h1>
		<s:form action="regpaq" theme="bootstrap">


			<!-- DESCRIPCION -->

			<s:textfield name="p.descripcion" label="Descripcion del prod."
				placeholder="Ingrese descripcion del producto"></s:textfield>

			<!-- STOCK -->

			<s:textfield type="number" name="p.dias" label="Dias"
				placeholder="Ingrese dias"></s:textfield>

			<!-- PRECIO -->

			<s:textfield type="number" name="p.precio" label="Precio"
				placeholder="Ingrese Precio"></s:textfield>

			<!-- IDCATEGORIA -->

			<!-- Para linear el combo :  -->
			<!-- Combo ruta: http://localhost:8090/Ejercicio2/llenarCombo -->

			<s:url id="idCat" action="llenaCombo" />

			<sj:select label="Categoria" name="p.idcategoria" list="listaCategorias"
				href="%{idCat}" listKey="idcategoria" listValue="descripcion"
				headerKey="-1" headerValue="Seleccione" cssClass="form-control"></sj:select>

			<s:submit value="Registrar" cssClass="btn btn-primary form-control"></s:submit>
		</s:form>
		<br>
		<s:actionmessage theme="bootstrap" />
		<s:actionerror theme="bootstrap" />
		<br>
		<p>	
			<s:property value="mensaje" />
		</p>
		
		
	</div>
	</body>
	<footer>
	<div style="background-color:yellow;height:150px; ">
	<br>
	<br>
	<p style="text-align: center;">Derechos reservados 2020 Naki   <img style=" display: float;" alt="imgFB" width="50px" src="imgs/fb.jpg">
	</p>
	</div>
	</footer>
</body>
</html>