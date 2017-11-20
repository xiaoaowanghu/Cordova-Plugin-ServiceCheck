var exec = require('cordova/exec');

exports.checkGoogleService = function (success, error, arg0) {
    exec(success, error, 'ServiceChecker', 'checkGooglePlayService', []);
};
