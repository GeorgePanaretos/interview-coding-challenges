## Task ##
Can you create a table of possibilities, where we can have a food/beer/wine after work? 

### Conditions ###
To not to use dummy data, we would like to play with Foursquare API, what contains mostly very accurate and updated data. The technology, how to connect and manage data from Foursquare API, is up to your choice,
but you have to give us an installation manual, how to run up your project.

### Helpers ###
Foursquare API offers REST API and clean documentation to access all the endpoints. 
* Full Docs - https://developer.foursquare.com/docs/

Testing endpoint:
* https://api.foursquare.com/v2/venues/search?&categoryId=4d4b7105d754a06376d81259&radius=300&client_id=[]&client_secret=[]&v=20170117&ll=48.168088,17.138037

** Params explanation **

* &categoryId = ID of the searching categories. Foursquare category tree url: https://docs.foursquare.com/data-products/docs/categories. You can choose one of the following Bar, Beerarea, Winery, or something you would prefer
* &radius = Numeric value of distance in meters - could be in range of 0 - 2000
* &client_id and &client_secret = Foursquare API needs credentials to create new app. You can use our testing values
* &v = version in format YYYYMMDD
* &&ll = lat and lng comma separated. You can find better place then Bratislava instead

### Table conditions ###

* Create (f.e. HTML) table with following rules:
* Table contains head - <thead> element
* Table contains body - <tbody> element
* Table contains min 7 rows each with 4 columns
* Name of the columns are Name | Category | Address | Distance . These names are present in table head
* Body of the table have only 4 rows visible. The rest must be visible after scrolling
* Table head is always visible and fixed at the top of the table - does not hide during the scrolling
* Table dimmensions and style is up to your choice, but table must be centered to the middle of view and resizing to HDMI laptop or Tablet does not break the centering

### Delivery ###
