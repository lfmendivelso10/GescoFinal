#!/bin/bash
# Proyecto Gesco
# Descripcion: El presente Shell Script está diseñado para establecer la configuración base para el uso de CMS MONO, construido por la Universidad de los Andes con financiamiento de Colciencias, como apoyo a la Insdustria Colombiana de Desarrollo de Contenidos Digitales. 2014

# Precondiciones
cd ~/
mkdir temporal
cd temporal
yum -y install curl


#
# Repositorios
#
wget http://pkgs.repoforge.org/rpmforge-release/rpmforge-release-0.5.3-1.el6.rf.i686.rpm
wget http://www.rabbitmq.com/releases/rabbitmq-server/v3.4.1/rabbitmq-server-3.4.1-1.noarch.rpm
wget http://http://mirror.nexcess.net/apache/tomcat/tomcat-7/v7.0.57/bin/apache-tomcat-7.0.57.tar.gz
wget http://pyyaml.org/download/libyaml/yaml-0.1.4.tar.gz

rpm --import http://apt.sw.be/RPM-GPG-KEY.dag.txt
rpm -ivh http://dl.fedoraproject.org/pub/epel/6/x86_64/epel-release-6-8.noarch.rpm
rpm -K rpmforge-release-0.5.3-1.el6.rf.i686.rpm 
rpm -i rpmforge-release-0.5.3-1.el6.rf.i686.rpm
curl -sL https://rpm.nodesource.com/setup | bash -


#
# Aplicaciones
#
yum list
yum -y install java-1.7.0-openjdk
yum -y install httpd
yum -y install mysql-server
yum -y install php php-mysql
yum -y install gcc php-devel php-pear
yum -y install ImageMagick ImageMagick-devel
yum -y install ffmpeg
yum -y install perl-Image-ExifTool
yum -y install dcraw
yum -y install git-core
yum -y install zlib-devel
yum groupinstall 'Development Tools'
yum -y install openssl-devel
yum -y install readline-devel
yum -y install sqlite-devel
yum -y install libxml2
yum -y install libxlst
yum -y install nodejs

chmod 777 -R rabbitmq-server-3.4.1-1.noarch.rp
rpm -Uvh rabbitmq-server-3.4.1-1.noarch.rp

cd ~/temporal
mv yaml-0.1.4.tar.gz libyaml.tar.gz
mv libyaml.tar.gz /opt/
cd /opt
tar -xzvf libyaml.tar.gz
cd libyaml
./configure --prefix=/usr/local
make
make install

cd ~/temporal
mv apache-tomcat-7.0.57.tar.gz tomcat7.tar.gz
mv tomcat7.tar.gz /opt/
cd /opt
tar -xzvf tomcat7.tar.gz
echo "#!/bin/bash" > /etc/profile.d/tomcat.sh
echo "CATALINA_HOME=/opt/tomcat7" > /etc/profile.d/tomcat.sh
echo "PATH=$CATALINA_HOME/bin:$PATH" > /etc/profile.d/tomcat.sh
echo "export PATH CATALINA_HOME" > /etc/profile.d/tomcat.sh
echo "export CLASSPATH=." > /etc/profile.d/tomcat.sh
chmod +x /etc/profile/tomcat.sh
chmod +x $CATALINA_HOME/bin/startup.sh
chmod +x $CATALINA_HOME/bin/shutdown.sh
chmod +x $CATALINA_HOME/bin/catalina.sn



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
rm -rf temp

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

