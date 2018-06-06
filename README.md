# CKAN to DSpace migration tool
Command-line tool allowing for the migration of data from a CKAN repository to a DSpace one.
## How to run the project

Enter your configuration details in the `application.properties` file. No quotes are required.

Install the project by running `mvn install` while on the same level as the `pom.xml` file.

You have 3 commands at your disposal:

`listA` lists the contents of the CKAN repository as a JSON printed to the console

`listB` lists the contents of the DSpace repository as a JSON printed to the console

`migrate` migrates data from CKAN to DSpace


Run `DPEX2-1.0-SNAPSHOT-jar-with-dependencies.jar` with one of the 3 commands, for example:
```bash
java -jar .\DPEX2-1.0-SNAPSHOT-jar-with-dependencies.jar listB
```
