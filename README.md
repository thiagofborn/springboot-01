# springboot-01

## DevOps Pipeline

* Jenkins integration with GitHub.

## DevSecOps Pipeline

TODO: 
* [Integration Code Scanner with - SpotBugs ](https://spotbugs.github.io/)
* Secrets
* Certificates

## Dev Env

Set dev environment via file.

Using the **application-dev.properties**

```shell
 java -Dspring.config.location="./src/main/java/application-dev.properties"  -jar target/myproject-0.0.1-SNAPSHOT.jar 
``` 

```txt
spring.application.name = myproject
server.port = 9090
```


```shell
java -jar target/myproject-0.0.1-SNAPSHOT.jar --server.port=9090
```