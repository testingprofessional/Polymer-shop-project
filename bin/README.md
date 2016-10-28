"# Polymer-shop-project" 

Challenge:
* Before i begin i had some troubles with Selenium and Firefox. I had to downgrade my Firefox version to make it work.
* The Polymer shop gives server errors while running the Selenium testsuite when the laptop is on WIFI.
* I replaced the asked 'Inbox - Subtle Acions T-shirt' for the 'Women's Android Heart T-Shirt' from 'Ladies T-shirts'
because of not recognizable item while running the test. I don't have the time to find out.
* To run the test smoothly i put some 'Thread.sleep' actions in the test. Normally i use other actions like 'wait for 
element present/visible' but it look like it doesn't work everywhere in the test. Also a time issue to find out.
* Polymer is new to me so i had to find out things that cost time.
 
Maintainability:
My main goal is to make the test suite maintainable so, for example, i used 'page objects' for that.

Xpath:
Normally i prefer 'id' or 'name' as identifier for elements. Because Polymer is generated code (most of it)
it's easier and safe to use xpath.

Junit:
I made use of Junit because of the use of annotations/testcases/etc.

The test suite:

Testcase 1: The test order 2 items and do a checkout. The checkout has a check to verify.

Testcase 2: The test does a check if the amount of items on each of 2 pages is right.
