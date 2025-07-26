<?php

/**
* Using the http://ip-api.com/json to grab the particular timezone base on the IP Address of the user.
* Also provide information about 'City','Country','Country Code','Zip Code' and 'Latitude'.
*
*/

$url = "http://ip-api.com/json";
$info = htmlspecialchars_decode($url);
$info = file_get_contents($info);
$info = json_decode($info);

# Getting the user current Timezone to set it in the setting of the PHP.
$timezone = $info->timezone;
date_default_timezone_set($timezone);

# Getting the current Latitude of the user from the API. 
$latitude = $info->lat . "," . $info->lon;