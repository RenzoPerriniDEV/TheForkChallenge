# Description

_Front automation_:
Write a program to login to TheFork and validate your personal information. Your script should do this the same way a 
typical human user would do it, using a web browser, but entirely automated and independently:
* Open up the TheFork home screen (on the web -, for native app you can get it from the App Store or Play Store).
* Login to the site. You will need to have an account created for this to have appropriate credentials.
* Open My Personal Information section and assert that the personal information matches with your account information.

_Backend automation_:
PokéAPI - Using the following URL https://pokeapi.co/api/v2/pokemon?limit=30, access the first 30 pokemon on the list, 
each one has a URL that has the data of each pokemon. Retrieve that url and access it, save in a list only the pokemon 
that are normal type or that one of their types is normal type.
You can take a look at the API documentation (https://pokeapi.co/docs/v2) in case you have any questions.

# Requirements
- JAVA JDK (Developed on 17.0.2 version)
- IntelliJ IDEA

# Installation
- Clone or download repository.
- Install JAVA JDK: https://www.oracle.com/java/technologies/downloads/
- Install IntelliJ IDEA: https://www.jetbrains.com/es-es/idea/download/#section=windows
- Open project with IntellJ IDEA:
  1) Open > Repository directory
- Download dependencies:
  1) Open pom.xml
  2) Right button > Maven > Download Sources and Documentation or Reload project

#Running test
- Run testng.xml: Right button > Run
- You can run separate tests open each class and running them from method name