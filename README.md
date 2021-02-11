# Wallet-calculation
The script is written in the Java programming language, TestNG and Rest Assured frameworks are also used.

To run this script and get a report in HTML format, you need:

1. In the testng.xml file, change the path to the wallet-calculation-api project (if it need), the "name" parameter (<test verbose = "2" preserve-order = "true" name = "C: / Users / User / IdeaProjects / wallet- calculation-api ">)

2. Run the script by clicking on the right mouse button on the testng.xml file and click on Run /testng.xml/

3. After completing all tests, open the edit configuration in the upper right corner, open the Listeners tab.

3.1 Left-click on the plus button in the lower left part of the tab

3.2 Enter EmailableReporter in the line and click Ok

3.3 Enter FaieldReporter in the line and click Ok

3.4 Click Applye and then Ok

4. Run the script again by right-clicking on the testng.xml file and click on Run /testng.xml/

5. Go to the test-output folder and open the emailable-report.html file in a browser.

In the report page, you can see the results of all tests.
For failed tests, the parameters and errors for which the test failed are visible.
