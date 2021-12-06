# ApiRest-con-Spring-Boot
Ejemplo simple para ver como crear un api rest con spring boot
-------------------------------------------------------------
CONFIGURACIONES A TENER EN CUENTA PARA EJECUTAR EL PROYECTO
-------------------------------------------------------------

1. El primer paso para ejecutar el Proyecto es eligir con que motor de BD trabajar, en este ejemplo se trabaja con PostgreSQL, pero se puede trabajar con cuaquier BD relacional (SQL Server, Mysql, Etc). Luego, crea una base de datos llamada "shop".


2.El segundo paso para ejecutar el Proyecto, es cambiar algunas configuraciones del archico "application.properties" ubicado en la ruta --> src/main/resources 
Modificar ,os siguientes lineas :
-spring.datasource.url -> Aqui debes poner la cadena de conexion a la BD que será diferente en caso elijas otro motor de BD.
-spring.datasource.username -> Coloca aquí el nombre de usuario del motor de base de datos.
-spring.datasource.password -> Aqui debes poner la contraseña de tu motor de BD.
Con essos tres puntos configruados, el proyecto se podria ejecutar con noralidad.
