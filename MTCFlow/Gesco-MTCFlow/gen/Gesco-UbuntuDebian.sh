#!/bin/bash
# Proyecto Gesco
# Descripcion: El presente Shell Script está diseñado para establecer la configuración base para el uso de CMS MONO, construido por la Universidad de los Andes con financiamiento de Colciencias, como apoyo a la Insdustria Colombiana de Desarrollo de Contenidos Digitales. 2014

#
# Preparación de Espacio de Trabajo
#
cd ~/
mkdir temporal
cd temporal
apt-get install -y curl #Descripcion: Gestor de descargas. Arquitectura: x64
apt-get install -y libcurl4-openssl-dev #Descripcion: Coleccion de librerias para habilitar comunicaciones vía CURL con SSL.

#
# Repositorios
#
add-apt-repository -y ppa:jon-severinsson/ffmpeg #Autor: jon-severinsson. Fuente: ppa:jon-severinsson/ffmpeg
add-apt-repository -y ppa:chris-lea/node.js #Autor: chris-lea. Fuente: ppa:chris-lea/node.js
echo deb http://www.rabbitmq.com/debian/ testing main >> /etc/apt/source.list #Autor: RabbitMQ. Fuente: deb http://www.rabbitmq.com/debian/ testing main
wget -t 0 -c http://www.rabbitmq.com/rabbitmq-signing-key-public.asc #Autor: RabbitMQ. Fuente: http://www.rabbitmq.com/rabbitmq-signing-key-public.asc
apt-ket add rabbitmq-signing-key-public.asc #Autor: RabbitMQ. Fuente: rabbitmq-signing-key-public.asc
wget -t 0 -c http://http://mirror.nexcess.net/apache/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57.tar.gz #Autor: Apache Foundation. Fuente: http://http://mirror.nexcess.net/apache/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57.tar.gz


#
# Aplicaciones
#
apt-get update
apt-get install -y lamp-server^ #Descripcion: LAMP server - Linux, Apache, MySQL and PHP. Arquitectura: x64
apt-get install -y openjdk-7-* #Descripcion: Oracle Java Development Kit versión 7. Arquitectura: x64
apt-get install -y imagemagick #Descripcion: Suite de funciones bitmaps por consola. Arquitectura: x64
apt-get install -y ffmpeg #Descripcion: Colección de librerias para gestión de archivos de audio y video. Arquitectura: x64
apt-get install -y libimage-exiftool-perl #Descripcion: Libreria para gestión de metadata. Arquitectura: x64
apt-get install -y perl-doc #Descripcion: Administración de archivos desde Perl. Arquitectura: x64
apt-get install -y dcraw #Descripcion: . Arquitectura: x64
apt-get install -y gpac #Descripcion: . Arquitectura: x64
apt-get install -y git-core #Descripcion: Núcleo para gestión de repositorios GIT. Arquitectura: x64
apt-get install -y zlib1g-dev #Descripcion: . Arquitectura: x64
apt-get install -y build-essential #Descripcion: Suite de librerias para modificación de kernel. Arquitectura: x64
apt-get install -y libssl-dev #Descripcion: Librerias para aplicación de SSL. Arquitectura: x64
apt-get install -y libreadline-dev #Descripcion: . Arquitectura: x64
apt-get install -y libsqlite3-dev #Descripcion: Librerias para administración y uso de Sqlite3(DBMS). Arquitectura: x64
apt-get install -y sqlite3 #Descripcion: Sqlite 3 DBMS. Arquitectura: x64
apt-get install -y libxml2-dev #Descripcion: Colección de librerias para la gestión de archivo XML. Arquitectura: x64
apt-get install -y libxslt1-dev #Descripcion: . Arquitectura: x64
apt-get install -y python-software-properties #Descripcion: Administración de archivos y fuentes Python. Arquitectura: x64
apt-get install -y nodejs #Descripcion: . Arquitectura: x64
apt-get install -y mysql-client #Descripcion: Cliente de conexión a base de datos MySQL. Arquitectura: x64
apt-get install -y libmysqlclient-dev #Descripcion: Librerias de conexión a base de datos MySQL. Arquitectura: x64
apt-get install -y rabbitmq-server #Descripcion: Servidor de colas de mensajes. Arquitectura: x64
apt-get install -y libyaml-dev #Descripcion: . Arquitectura: x64
apt-get install -y tomcat7 #Descripcion: Contenedor de Sevlets. Versión 7. Arquitectura: x64

#
#Configuración e instalación de Mono
#

cd /opt
wget -t 0 -c http://ftp.ruby-lang.org/pub/ruby/ruby-1.9.3-p547.tar.gz
tar -xzvf ruby-1.9.3-p547.tar.gz
cd ruby-1.9.3-p547/
./configure
make
sudo make install
ruby -v

gem install rails --version 3.2.8 #Descripcion: Framework para aplicaciones web en Ruby. Ruby on Rails. Version: 3.2.8. Arquitectura: x64
gem install bundler #Descripcion: Gestor de dependencia en Ruby on Rails. Arquitectura: x64

cd ~/
mkdir cms
cd cms
wget -t 0 -c http://157.253.238.183/temp/cms.sql
chmod 777 cms.sql
mysql -u root -p < cms.sql
wget -t 0 -c http://157.253.238.183/temp/mono.tar.gz
chmod 777 mono.tar.gz
tar -xzvf mono.tar.gz
chmod 777 -R mono
bundle install

cd ~/
rm -rf temporal

echo "=================================="
echo "Proceso de instalación ha finalizado"
echo "=================================="
echo "Por favor, ingrese a directorio 'cms', luego a la carpeta 'mono' y finalmente a la carpeta 'config'"
echo "Y en modifique el archivo 'database.yml' en los apartados 'password' con la contraseña de su "
echo "gestor base de datos MySQL. Ejemplo: 'password: 12345678'."
echo "=================================="
echo "Finalmente regrese a la carpeta mono, y ejecute el comando 'rails server'"
echo "Espere un momento mientras carga, y finalmente desde un explorador de internet"
echo "Ingrese a la direccion: 'localhost:3000'"
echo "El usuario por defecto es: admin@david.com"
echo "Y la contraseña es: 12345678"
echo "====== Gracias por usar Gesco ======"

