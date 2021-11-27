node {

    checkout scm
    stage('mongo-fetch'){
        sh 'docker stop mongodb'
        sh 'docker run -d -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=secret --name mongodb  mongo'
    }
    stage('build')      
          sh 'mvn clean package' 
    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {

        def customImage = docker.build("9400608284/customer-service")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
