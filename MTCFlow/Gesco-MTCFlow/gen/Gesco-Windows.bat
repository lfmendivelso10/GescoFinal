REM Pre-requisito: Tener instalado wget y referenciado en el path, tener instalado 7zip
@echo off
title Instalacion Servidores MONO
wget http://users.ugent.be/~bpuype/wget/wget.exe
REM Inicia descarga de WAMP-Server
wget http://sourceforge.net/projects/wampserver/files/latest/download
REM Inicia instalacion de WAMP-Server
start wampserver2.5-Apache-2.4.9-Mysql-5.6.17-php5.5.12-32b.exe
pause > nul 
REM Inicia descarga de Java
wget http://download.oracle.com/otn-pub/java/jdk/7u71-b14/jdk-7u71-windows-x64.exe
REM Inicia instalacion de Java
start jdk-7u71-windows-x64.exe
pause > nul 
REM Inicia descarga de Tomcat7
wget http://apache.osuosl.org/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57.exe
REM Inicia instalacion de Tomcat7
start apache-tomcat-7.0.57.exe
pause > nul 
REM Inicia descarga de Ghostscript
wget http://sourceforge.net/projects/ghostscript/files/latest/download
REM Inicia instalacion de Ghostscript
start gs909w32.exe
pause > nul 
REM Inicia descarga de ImageMagick
wget http://www.imagemagick.org/download/binaries/ImageMagick-6.9.0-0-Q16-x64-dll.exe
REM Inicia instalacion de ImageMagick
start ImageMagick-6.9.0-0-Q16-x64-dll.exe
pause > nul 
REM Inicia descarga de UFraw
wget http://sourceforge.net/projects/ufraw/files/ufraw/ufraw-0.19.2/ufraw-0.19.2-2-setup.exe/download
REM Inicia instalacion de UFraw
start ufraw-0.19.2/ufraw-0.19.2-2-setup.exe
pause > nul 
REM Inicia descarga de MP4Box
wget http://www.videohelp.com/download/GPAC.Framework.Setup-0.5.1-DEV-rev5491-x64.exe
REM Inicia instalacion de MP4Box
start GPAC.Framework.Setup-0.5.1-DEV-rev5491-x64.exe
pause > nul 
REM Inicia descarga de RabbitMQ
wget https://www.rabbitmq.com/releases/rabbitmq-server/v3.4.1/rabbitmq-server-3.4.1.exe
REM Inicia instalacion de RabbitMQ
start rabbitmq-server-3.4.1.exe
pause > nul 
REM Inicia descarga de Railsinstaller
wget https://s3.amazonaws.com/railsinstaller/Windows/railsinstaller-2.2.4.exe
REM Inicia instalacion de Railsinstaller
start railsinstaller-2.2.4.exe
pause > nul 
echo Al terminar la instalacion del Railsinstaller, presione una tecla para continuar...
pause > nul
exit
