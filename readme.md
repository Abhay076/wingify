### scripts for a login page in Selenium with Java


#### 1. Create A Selenium WebDriver Instance

Webdriver driver=new ChromeDriver(); 
In order to launch the website in the desired browser, you need to set the system properties to the path of the driver for the required browser. In this Selenium Java tutorial, we will use chromedriver for demonstrating Selenium login example with Java. The syntax for the same will be:

System.setProperty(“webdriver.chrome.driver”, “File path for the Exe”); 
#### 2. Configure Your Browser If Required

Based on the needs, we can configure the browser. For example, in this Selenium Java tutorial regarding Selenium login with Java, a browser by default, will be minimized mode, we can set up the browser in the maximize mode. Below is the syntax used for the same.

driver.manage().window().maximize(); 
Other things that you can do for configuring your browser is set up different options like disabling info bars, browser notifications, adding extensions etc. You can also use the capabilities class to run your script on various browsers thereby helping in cross browser testing.

#### 3. Navigate To The Required URL

Pretty simple, open the browser with the desired URL. All you have to do is write the below syntax and you have your URL open in the desired instantiated browser.

driver.get(“https://sakshingp.github.io/assignment/login.html”); 
 #### 4. Locate The HTML Element

This is the heart of writing a Selenium script. For this to function, you need to have a clear understanding of the different locators used to find the HTML element. You can refer below articles that talks about the different locators available in selenium and how to locate the element with different examples:


You can locate it via ID locator in Selenium WebDriver as below:

driver.findElement(Domain Premium: By.id(“username”)); 
Since this returns a webelement, you can store it in webelement variable as below:

WebElement username=driver.findElement(Domain Premium: By.id(“username”)); 
The same can be achieved for password and login button field which is:

driver.findElement(Domain Premium: By.id(“password”)); 
WebElement password=driver.findElement(Domain Premium: By.id(“password”)); 
driver.findElement(By.xpath(“//button[text()=’Sign in’]”)); 
WebElement login= driver.findElement(By.xpath(“//button[text()=’Sign in’]”)); 

#### 5. Perform Action On The Located HTML Element

Once located, you need to perform the desired action which in our case is sending a text to email and password field and clicking on the login button. To execute this action in Selenium login example with Java, we make use of methods as sendKeys and click provided by Selenium as below:

username.sendKeys(“xyz@gmail.com”); 
password.sendKeys(“exampleAboutSelenium123”); 
login.click();

#### 6. Verify & Validate The Action

In order to validate the results, all you need to do is use assertion. Assertions are vital for comparing the expected results vs the actual results. Almost similar to your test cases, wherein each test case has an actual and expected behaviour to it. If it matches, the test case pass, if not, then the test case fails. Assertions do exactly the same. Assertion class are provided by both JUnit and TestNG framework, you can opt to choose any. The below syntax will help to assert (validate) the outcome from actions by performing Selenium login with Java.