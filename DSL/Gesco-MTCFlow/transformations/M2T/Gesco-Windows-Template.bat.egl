123
REM Pre-requisito: Tener instalado wget y referenciado en el path, tener instalado 7zip
@echo off
title Instalacion Servidores MONO
wget http://users.ugent.be/~bpuype/wget/wget.exe
wget http://sourceforge.net/projects/wampserver/files/latest/download
echo se inicia la instalación de WAMP server...
start wampserver2.5-Apache-2.4.9-Mysql-5.6.17-php5.5.12-32b.exe
echo Al terminar la instalacion de wamp server, presione una tecla para continuar...
pause > nul
REM Descarga de mysql workbench
wget http://dev.mysql.com/get/Downloads/MySQLGUITools/mysql-workbench-community-6.2.3-winx64.msi
echo se inicia la instalación de MySQL Workbench...
start mysql-workbench-community-6.2.3-winx64.msi
echo Al terminar la instalacion del mysql workbench, presione una tecla para continuar...
pause > nul
REM Instalación Tomcat7
REM Lo primero que se instalará será el JDK7
wget wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jdk/7u71-b14/jdk-7u71-windows-x64.exe 
ren "jdk-7u71-windows-x64.exe@AuthParam=1416277259_cb4ec40dde7dfdae11dbf45e56447738" "jdk-7u71-windows-x64.exe"
echo se inicia la instalación del JDK7...
start jdk-7u71-windows-x64.exe
echo Al terminar la instalacion del JDK7, presione una tecla para continuar...
pause > nul
REM Luego de tener instalado el JDK7, se debe instalar el Tomcat7
wget http://www.trieuvan.com/apache/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57-windows-x64.zip
REM start
REM Razuna y RabbitMQ
REM Primero se instala ghostscript
wget http://sourceforge.net/projects/ghostscript/files/latest/download
echo se inicia la instalación de ghostscript...
start gs909w32.exe
echo Al terminar la instalacion del ghostscript, presione una tecla para continuar...
pause > nul
REM Segundo se debe instalar ImageMagick
wget http://www.imagemagick.org/download/binaries/ImageMagick-6.9.0-0-Q16-x64-dll.exe
echo se inicia la instalación de ImageMagick...
start ImageMagick-6.9.0-0-Q16-x64-dll.exe
echo Al terminar la instalacion del ImageMagick, presione una tecla para continuar...
pause > nul
REM Tercero hay que instalar FFMpeg
wget http://ffmpeg.zeranoe.com/builds/win64/static/ffmpeg-20140506-git-2baf1c8-win64-static.7z
REM start
REM Cuarto se debe instalar Exiftool
wget http://www.sno.phy.queensu.ca/~phil/exiftool/Image-ExifTool-9.76.tar.gz
REM start
REM Quinto se debe instalar UFraw
wget http://sourceforge.net/projects/ufraw/files/ufraw/ufraw-0.19.2/ufraw-0.19.2-2-setup.exe/download
echo se inicia la instalación de UFraw...
start ufraw-0.19.2-2-setup
echo Al terminar la instalacion del UFraw, presione una tecla para continuar...
pause > nul
REM Sexto se instala MP4Box
wget http://www.videohelp.com/download/GPAC.Framework.Setup-0.5.1-DEV-rev5491-x64.exe
echo se inicia la instalación de MP4Box...
start GPAC.Framework.Setup-0.5.1-DEV-rev5491-x64.exe
echo Al terminar la instalacion del MP4Box, presione una tecla para continuar...
pause > nul
REM Finalmente se instala Razuna
wget http://razuna.org/razuna-tomcat.cfm?v=1.7
REM start
REM Descarga de RabbitMQ
wget https://www.rabbitmq.com/releases/rabbitmq-server/v3.4.1/rabbitmq-server-3.4.1.exe
echo se inicia la instalación de RabbitMQ...
start rabbitmq-server-3.4.1.exe
echo Al terminar la instalacion del RabbitMQ, presione una tecla para continuar...
pause > nul
REM RoR
REM Se instala un paquete llamado Railsinstaller
wget https://s3.amazonaws.com/railsinstaller/Windows/railsinstaller-2.2.4.exe
echo se inicia la instalación de Railsinstaller...
start railsinstaller-2.2.4.exe
echo Al terminar la instalacion del Railsinstaller, presione una tecla para continuar...
pause > nul
exit