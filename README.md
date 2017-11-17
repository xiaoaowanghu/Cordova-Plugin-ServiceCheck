# Cordova Check Installed Service Plugin

The plugin for checking google play service.

Using...
	document.addEventListener('deviceready', function () {
	
		var success = function(message) {
			// message.isGooglePlayServicesAvailable is a boolean value
			console.log("GooglePlayServiceInstalled? " + message.isGooglePlayServicesAvailable.toString());
		} 

		var failure = function(message) {
			alert(JSON.stringify(message));
		}

		CheckInstalledServices.check(success, failure);
	});



