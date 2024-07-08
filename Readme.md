## BDD Framework
Behavior-Driven Development is a process in an organization that involves discussing and collaborating to determine the desired behavior of a user story. BDD was born from Test Driven Development (TDD) and typically involves a user story as its starting point

#Swag Labs
Retail 

#Structure of the Framework
Layered structure framework is created for the Application "Swag Labs".
User Has to create Packages called:
1. browserControl
2. features
3. pageObjects
4. stepDefinitions
5. utilities
6. TestRunner Class file.
Generating reports in a Behavior-Driven Development (BDD) framework involves using tools that integrate with your testing framework to produce human-readable documentation of test results. Popular BDD frameworks like Cucumber, JBehave, and SpecFlow provide built-in support or integrations for generating these reports. Here's a detailed guide on how to generate reports in BDD frameworks using Cucumber as an example:
Step-by-Step Guide to Report Generation in Cucumber
1. Setup Cucumber in Your Project

Ensure Cucumber is properly set up in your project. If you’re using Maven, add the necessary dependencies in your pom.xml
2. Create Feature Files

Create feature files that contain your BDD scenarios. For example, create a file named example.feature.
3. Implement Step Definitions

Implement the step definitions for your scenarios in a Java class. For example, create a class named StepDefinitions.java
4. Configure Cucumber Runner

Create a JUnit test runner for Cucumber. For example, create a class named RunCucumberTest.java:
In the @CucumberOptions annotation:

    features specifies the path to your feature files.
    glue specifies the package containing your step definitions.
    plugin specifies the report format and output location.

5. Run Tests and Generate Reports

Run the RunCucumberTest class as a JUnit test. This will execute your Cucumber scenarios and generate reports.
6. View the HTML Report

After running the tests, an HTML report will be generated in the specified directory (target/cucumber-reports.html).
Advanced Reporting Options

Detailed Explanation of Each Component
1. Feature Files (src/test/resources/features)

Feature files contain the scenarios written in Gherkin syntax. Each feature file corresponds to a specific feature of the application.
2. Step Definitions (src/test/java/com/example/steps)

Step definitions map the Gherkin steps to Java code. This is where the implementation of each step is defined.
3. Page Objects (src/test/java/com/example/pages)

Page objects represent the pages of your web application. Each page object contains methods to interact with the web elements on the page.
4. Runner Classes (src/test/java/com/example/runners)

Runner classes are used to run the Cucumber tests. They specify the location of the feature files and step definitions
5. Hooks (src/test/java/com/example/hooks)

Hooks are used to perform setup and teardown activities before and after each scenario.
6. Utility Classes (src/test/java/com/example/utils)

Utility classes contain reusable methods and configurations, such as driver setup.


#AbouT Cumcumber and Gherkin
Cucumber is an open-source, software tool that supports the Behaviour Driven Development (BDD) framework for writing automated acceptance tests. Cucumber is written in the Gherkin language to define test cases, more of which will be explained later on.


# Report Generation
Add screenshot in Readme file:
In IntelliJ IDEA, there are various types of reports you might want to view, such as test reports, code coverage reports, inspection results, and more. Here's how you can view different types of reports:
1. Test Reports

To view test reports in IntelliJ IDEA:

    --Run Your Tests:
        Use the Run or Debug buttons in the toolbar, or right-click on your test class/method and select Run.

    --Test Results Tool Window:
        After running the tests, the Test Results window will open automatically.
        You can see the results of your tests, including passed, failed, and ignored tests.

    ---Navigate to Test Report:
        To view more detailed information about a specific test, click on the test in the Test Results window.