pipeline {
    agent any

    stages {
        stage('Build and Run') {
            steps {
                script {
                    echo 'Compilando y ejecutando el programa Java...'
                    sh 'javac ControlCalidadEmpleados.java'
                    sh 'java ControlCalidadEmpleados'
                }
            }
        }
    }
}
