node {

    checkout scm
    DOCKER_HOME = tool "Docker"
    sh '
        echo $DOCKER_HOME
        ls $DOCKER_HOME/bin/
        $DOCKER_HOME/bin/docker images
        $DOCKER_HOME/bin/docker ps -a
        $DOCKER_HOME/bin/docker run -d -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=secret --name mongodb  mongo
    '
    stage('build')      
          sh 'mvn clean package' 
    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {

        def customImage = docker.build("9400608284/customer-service")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
