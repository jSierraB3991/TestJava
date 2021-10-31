#!/bin/bash

#fi you like not question, uncommented lines (4 and 5) and commented lines (6 ad 7)
#application=yournameapp
#version=1.0
read -p "Write your app: " application
read -p "what's is a version of $application: " version

showMensajes="cowsay"
$showMensajes "Search $application:$version in your docker images"

dockerimage=$(sudo docker images --format "{{.Repository}}" $application:$version)
if [ "$dockerimage" != "" ]; then
    read -p "you images $application:$version already exists, Dou you like remove?: " response

    if [ $response == "y" ] || [ $response == "s" ] || [ $response == "Y" ] || [ $response == "S" ]; then
        $showMensajes "Deleting docker images $application:$version"
        sudo docker rm $(sudo docker ps -qa)
        sudo docker rmi "$application:$version"
    fi
fi

dockerimage=$(sudo docker images --format "{{.Repository}}" $application:$version)
if [ "$dockerimage" == "" ]; then
    mvn clean && mvn install
    $showMensajes "Creating docker images $application:$version"
    sudo docker build . --tag $application:$version

    dockerimage=$(sudo docker images --format "{{.Repository}}" $application:$version)
    if [ $dockerimage != "" ]; then
        $showMensajes "Image created successfull"
        sudo docker-compose up
    else
        $showMensajes "Anyway error"
    fi
fi
