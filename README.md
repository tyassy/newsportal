# Hello,

Welcome to Tyas's Assignment Test. In this page I am going to share how to run the test cases in this repository.

## To Be Prepared

- Google Chrome (for reference: I mainly run the test case using Version 103.0.5060.53).
- IDE Application (for reference: I am using IntelliJ IDEA 2021.1.3). After installing Intellij, there are still some things to be installed in plugins for a better testing experience.
    - Cucumber +
    - Cucumber for Java
    - Gherkin
- Stable internet connection, as all test cases will access web browser.

## How To Test

After Cucumber + and Cucumber for Java are installed, test cases can be tested from feature file by following the steps below:

- Clone the repository
- Open newsportal.feature
- Simply click play button on the left scenario name to run per case
- Or, simply click play button on the left of Feature: News Portal to run all cases

If both Cucumber + and Cucumber for Java are unable to be installed for some reasons, test cases can be run also from CucumberRunner by following steps below:

- Open file CucumberRunner
- Run CucumberRunner (Tagging @NewsPortal is already there, so it can be executed right away)

After run the test case, test report can be seen in Run tab Intellij, and it is also available html format that can be accessed by clicking the link with prefix reports.cucumber.io/reports link is available in bottom in Run tab after run test.

Test report will look like this url: https://reports.cucumber.io/reports/b1d5974f-7d21-4a5f-ac46-dd19589e2b83 (this is a generated html from August 17, and it will be automatically deleted after 24 hours.)