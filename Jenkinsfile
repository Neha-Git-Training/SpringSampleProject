node{
  stage('git checkout'){
    git 'https://github.com/Neha-Git-Training/SpringSampleProject'
  }
  
  stage('compile-maven-jar'){
    //get mav home path
    def mvnHome = tool name: 'maven_home', type: 'maven'
    sh "${mvnHome}/bin/mvn package"


      
      stage('build docker image'){
          dir("${WORKSPACE}/target"){
          sh "pwd"
          sh label: '', script: 'ls'
            
          sh "docker build -t SpringSample" .
            }
      }
      
    
    
  }
}
