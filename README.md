# sampleapi
This repo cotains code of a sample rest api.
The api returns the MD5 hash of a given name.


The api can be invoked from browse using
http://<BASE_URL>/md5-hash?name=Santhosh

For example if the api running in local machine then
http://localhost:8080/md5-hash?name=Santhosh

# how to build the api
## install java 21
## ./gradlew build
## cd build/libs
## java -jar apis-1.0.0.jar




