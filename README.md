# spring-https
 how to enable HTTPS in a Spring Boot Application
 
 # CMD to generate Self signed certificate with public key
keytool -genkey -alias spring-https -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore javatechie.jks 
