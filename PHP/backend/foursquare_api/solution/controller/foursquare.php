<?php

#
require 'location.php';

#
$foursquare_url = "https://api.foursquare.com/v2/venues/search?&categoryId=4bf58dd8d48988d11b941735&radius=300&client_id=2TC0GHMY3FTKAY5Y3WSXWTYUT3EY0CL11DOTPSD5BELKYDVU&client_secret=ISIT3PFVCZORCQA0J3YGFOJOQ1C3GUZPUDFUKL3LKGRR4O5N&v=" . date(Ymd) . "&ll=$latitude";


$foursquare = htmlspecialchars_decode($foursquare_url);
$foursquare = file_get_contents($foursquare);
$foursquare = json_decode($foursquare);