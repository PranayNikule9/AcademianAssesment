# AcademianAssesment

Description : Automation Testing Done on Book My Show Website.

Question :
Open https://in.bookmyshow.com/explore/home/
If a city is asked - Select Bengaluru
Click on SignIn
Click on Continue with Email
Enter seleniumauto@yopmail.com and click on continue.( If you face any issue, you can use any other name in place of “Seleniumauto”)
Go to Yopmail.com
Type seleniumauto@yopmail.com  and access inbox (Password is not required)
Locate the latest email from BookMyShow and fetch the OTP
Come back to Sign in Page and enter the OTP
Validate user is successfully signed in and “Hi, Guest” is displayed

Solution :
Test Steps:

Open the BookMyShow website (https://in.bookmyshow.com/explore/home/).
Select the city as Bengaluru.
Click on the "Sign In" button.
Click on "Continue with Email" option.
Enter the email address "seleniumauto@yopmail.com" in the email field.
Click on the "Continue" button.
Open a new tab and navigate to Yopmail.com.
In the Yopmail inbox, enter "seleniumauto@yopmail.com" in the email field and access the inbox without entering a password.
Locate the latest email from BookMyShow in the inbox.
Fetch the OTP (One-Time Password) from the email.
Go back to the BookMyShow Sign In page.
Enter the fetched OTP in the OTP field.
Click on the "Sign In" button.
Verify that the user is successfully signed in.
Check if the greeting message "Hi, Guest" is displayed.


Expected Results:

The BookMyShow website should be successfully opened.
Bengaluru should be selected as the city.
The Sign In page should be displayed.
The "Continue with Email" option should be selected.
The email address "seleniumauto@yopmail.com" should be entered.
The email address should be successfully submitted.
The Yopmail website should be opened.
The Yopmail inbox for "seleniumauto@yopmail.com" should be accessed.
The latest email from BookMyShow should be visible.
The OTP should be successfully fetched from the email.
The BookMyShow Sign In page should be displayed.
The fetched OTP should be entered.
The user should be successfully signed in.
The greeting message "Hi, Guest" should be displayed.
