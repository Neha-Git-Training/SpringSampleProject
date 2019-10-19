node{
  stage('git checkout'){
    git 'https://github.com/Neha-Git-Training/SpringSampleProject'
  }
  
  stage('compile-maven-jar'){
    //get mav home path
    def mvnHome = tool name: 'maven_home', type: 'maven'
    sh "${mvnHome}/bin/mvn package"

  }
      
  stage('build docker image -push'){
     // sh "sudo docker build -t springbootsample-image ." 
      sh "sudo docker login"
      sh "sudo docker build -t nehayadav12/springbootsample12:sampleimage ." 
      sh "sudo docker push nehayadav12/springbootsample12:sampleimage" 
  }
}
