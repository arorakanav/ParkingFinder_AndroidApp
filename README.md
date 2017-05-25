# ParkingFinder_AndroidApp
Android Application for finding nearby parking places

Parking Finder is an android application for registering Parking places and finding nearby places.

The app has mainly two functionalities 
1. An Vendor can add a parking place on the google map
2. The user can view nearby parking places using google maps

The profiles of user and vendor are saved on an database. Similarly the database also has a table to save all the parking places added by a vendor.

Databases:
The testing  of Databases were done using wamp server and ngrock.
Screenshots of database can be found in DatabaseSecreenshot.zip folder.
Name of Database: parkingfinder
No of tables:2 (parkplaces,user)

Additional Details
PHP files can be found in PHP_ParkFinder.zip
For connection to database change link in the config file.
In the interface folder has all the interfaces for linking the application to Database using specific PHP files.

API used:
Google Maps
Retrofit 2.0
