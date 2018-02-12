#### The steps in order to start your learning path
 
0. Create a github account 

1. Fork repository, you will see the copied repo after into your user page in github
https://help.github.com/articles/fork-a-repo/#fork-an-example-repository

2. Clone the forked repo
https://www.youtube.com/watch?v=R6JomxUjTq8

// todo record a video where will be described lifecycle
1. If you have not cloned project yet, just clone project
	
	a) During the cloning choose gradle
	or
	b) open in IDEA -> choose gradle.build -> Open as project
	    https://www.jetbrains.com/help/idea/gradle.html#gradle_import
	
	Delegate all build IDEA commands to gradle
	In IDEA (Ctrl + Alt + S) 
	Build, Execution, Deployment -> Build Tool -> Gradle -> Runner
	Activate Delegate IDE build/run actions to Gradle 

#### Choose task 

* To run gradle on linux or mac ```./gradlew```
* To run gradle on Win ```gradlew```
* Show all tasks\
```./gradlew showTasks```
* Copy the task's files to your module\
```./gradlew -Ptask=<TaskName> copyTask```
* Example\
```./gradlew -Ptask=week1 copyTask```
* Check your module(```student-module```), there must be packages of the copied task
* To find and run tests for the specific task
    * Ctrl + Click on your method in some class, 
    * go to the tests
    * run all tests or one by clicking a green 'play' button on the left panel 





