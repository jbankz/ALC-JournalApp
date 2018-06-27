# ALC-JournalApp
A journal application where in users can pen down their thoughts and feelings.

# Andela Journal-App
Journal App is a simple application where in users can pen down their thoughts and feelings. 
The user clicks on a button which takes the user a screen where the user can add an activity and the user can also update an activity by clicking on the item that needs to be updated.

The app uses the **MVVM Architecture**. I have used the following components for development:

* Room - For offline data persistence
* LiveData - Handle data in a lifecycle-aware fashion 
* ViewModel - Manage your UI's data in a lifecycle-aware fashion
* ButterKnife -  minimize the glue code necessary to bind your application logic and layouts
* Firebase – Handles user’s authentication.

> The final apk can be downloaded here: <https://github.com/jbankz/ALC-JournalApp/blob/master/Apk/app-debug.apk>

## Prerequisites
You will need the following to run this project:
1. A laptop or desktop machine with internet access
2. Android Studio 3.1 Stable Channel (Latest Stable Release)

## Setting Up
* Clone the Repository from Github
* Open the project folder using Android Studio IDE

### Authentication Page
The User will be presented with the Authentication Page, where they are required to authenticate themselves using Google Login


<img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/authentication_one.png" width="280"/>   <img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/authentication_two.png" width="280"/> 


### Main Dashboard 
After being authenticated, the user is redirected to the Main Dashboard Page, which is the Main Activity in our application. The Dashboard shows the app has no activity added, and gives the User the options to:

* Add New Journal

<img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/main_one.png" width="280"/>   <img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/main_two.png" width="280"/> 

### Journal Insert and Update Page
This page enables the user to update an item and also add another item to previous lists
<img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/add_one.png" width="280"/>   <img src="https://github.com/jbankz/ALC-JournalApp/blob/master/Screenshots/add_two.png" width="280"/>

### Sign Out
The users can leave the app by signing out.

<img src="https://github.com/jbankz/ALC-JournalApp/blob/master/screenshots/sign_out.png" width="280"/> 

### Undone Parts
* Not done all Unit Tests
