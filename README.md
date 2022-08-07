# SwagLabs
TrusTrace  Interview Assessment

# Description 
Selenium Automation Framework to automate the testing of SwagLabs Web UI. The framework has been created in such a way that it can be 
easily modified to be used in different environments[non-prod and prod]. It is developed using JAVA and several other components like
Selenium, Maven, TestNG, ExtentReports. The framework has been developed to run in local machine with the scope of running in remote machine
in future if needed.

# Installation Process
The following tools are required to run the automation scripts in local machine. 
1. Eclipse IDE for Java Developers (includes Incubating components) - Version: 2022-03 (4.23.0)
2. Install Eclipse m2e - Maven support in Eclipse IDE from Eclipse Marketplace
3. Install TestNG for Eclipse plugin from Eclipse Marketplace

# Setup
The following process will help in setting up the project.
1. Import/Pull the project in Eclipse
2. Edit the config.properties file present inside the folder - \src\test\resources\Configuration\config.properties
		(a) Desired Browser
		(b) URL for SauceDemo Website based on the environment
		(c) UserID and Password

# Execution
1. Once the project is setup in Eclipse, right click on the project and click "Run As" and Select "Maven Test"
2. This will executre the classes configured in testng.xml
3. In order to run specific set of tests, create new testng.xml and change the properties of maven-surefire-plugin 
   from  "\<suiteXmlFile\>testng.xml\</suiteXmlFile\>" to the new suite file name

# Reports
1. Extent Report is used to document all the test execution.
2. Report will be automatically opened once the execution is completed.
3. We can also find the reports under user.dir/extent-test-output/


 
	

