# Cordova Check Installed Service Plugin

## The plugin for checking google play service. All stuff has been tested.

Usage
-----

	document.addEventListener('deviceready', function () {
	
		var success = function(message) {
			// message.isGooglePlayServicesAvailable is a boolean value
			console.log("GooglePlayServiceInstalled? " + message.isGooglePlayServicesAvailable.toString());
		} 

		var failure = function(message) {
			alert(JSON.stringify(message));
		}

		ServiceChecker.checkGoogleService(success, failure);
	});



