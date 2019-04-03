# Cucumber demo project

My sample WWW automation project - [Test Page](http://parabank.parasoft.com)


## Introduction

This is just sample test automation project on testing WWW. For this puropse Selenide and Cucumber frameworsk have been used and some other tools described in "Build With" section. Project contains some sample features and related test cases such us user registration, login into user account  and some basic operations. 


### Prerequisites

- JAVA (I use jdk-11.0.1) - [LINK](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
- Intellij or other similar tool- [LINK](https://www.jetbrains.com/idea/)
- Maven (I use apache-maven-3.6.0) - [LINK](https://maven.apache.org/)
- Chrome browser - [LINK](https://www.google.com/chrome/)


### Installing

- Open Intellij or other similar tool. 
- Select: New > Project from Version Control > GIT
- Set:
	URL: https://github.com/tfdemo1/demo1.git
	Directory: create new folder on the disk and copy here his path
- Press Clone button to finish configuration.


## Running the tests

- run TestRunner class using IntelliJ tool
or
- run "mvn clean test –PALL" command inside project folder using CMD 


## Built With

* [Selenide](https://selenide.org/) - Framework for test automation
* [Cucumber](https://cucumber.io/) - tool for supporitng BDD
* [Maven](https://maven.apache.org/) - Dependency Management
* [Maven surfire plugin](https://maven.apache.org/surefire/maven-surefire-plugin/index.html) - plugin for tests execution
* [TestNG](https://testng.org/doc/index.html) - automation testing framework supporting tests execution
* [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) - solution for using WebDriver binaries easier


## Author

* **Tomasz Frynia** - *concept and code*

