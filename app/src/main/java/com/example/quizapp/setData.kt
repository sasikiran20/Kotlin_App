package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Which of the following services provides real-time messaging?",

           "Cloud Pub/Sub",
           "Big Query",
           "App Engine",
           "Datastore",
           1
       )
       var question2 = QuestionData(
           2,
           "Cloud SQL is based on which database engine?",

           "Microsoft SQL Server",
           "MySQL",
           "Oracle",
           "Informix",
           2
       )
       var question3 = QuestionData(
           3,
           "Of the options given, which is a NoSQL database?",

           " Cloud Datastore",
           "Cloud SQL",
           "All of the given options",
           "Cloud Storage",
           1
       )
       var question4 = QuestionData(
           4,
           "Container Engine allows orchastration of what type of containers?",

           "Blue Whale",
           "LXC",
           "BSD Jails",
           "Docker",
           4
       )

       var question5 = QuestionData(
           5,
           "Which of the follow products will allow you to host a static website?",

           "Cloud SDK",
           "Cloud Endpoints",
           "Cloud Storage",
           "Cloud Datastore",
           3
       )

       var question6 = QuestionData(
           6,
           "Which of the following is an analytics data warehouse?",

           "Cloud SQL",
           "Big Query",
           "Datastore",
           "Cloud Storage",
           4
       )

       var question7 = QuestionData(
           7,
           "Which of these options is not a valid Cloud Storage class?",

           "Glacier Storage",
           "Nearline Storage",
           "Coldline Storage",
           "Regional Storage",
           1
       )

       var question8 = QuestionData(
           8,
           "Container Engine is built on which open source system?",

           "Swarm",
           "Kubernetes",
           "Docker Orchastrate",
           "Mesos",
           2
       )

       var question9 = QuestionData(
           9,
           "Which of the following is not a type of IAM role?",

           "Predefined",
           "Basic",
           "Custom",
           "Advanced",
           4
       )

       var question10 = QuestionData(
           10,
           "Which of the following is not a type of IAM member?",

           "Organization Account",
           "Cloud Identity domain",
           "Service Account",
           "Google Workspace domain",
           1
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)


       return que
   }
}