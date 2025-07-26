<?php

#Gets current latitude and set the timezone so doen't cause warning from the php.
require 'location.php';

# Gets constant variables for the parametrs of the foursquare url. 
require 'fixed_values.php';


$foursquare_url = "https://api.foursquare.com/v2/venues/search?&categoryId=$category_id&radius=$radius&client_id=$client_id&client_secret=$client_secret&v=$date&ll=$lat";

# This takes the current latitude from the location.php and the current date.
// $foursquare_url = "https://api.foursquare.com/v2/venues/search?&categoryId=4d4b7105d754a06376d81259&radius=300&client_id=2TC0GHMY3FTKAY5Y3WSXWTYUT3EY0CL11DOTPSD5BELKYDVU&client_secret=ISIT3PFVCZORCQA0J3YGFOJOQ1C3GUZPUDFUKL3LKGRR4O5N&v=" . date(Ymd) . "&ll=$latitude";


$foursquare = htmlspecialchars_decode($foursquare_url);
$foursquare = file_get_contents($foursquare);
$foursquare = json_decode($foursquare);