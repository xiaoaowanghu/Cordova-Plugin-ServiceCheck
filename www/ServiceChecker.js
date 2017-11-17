var exec = require('cordova/exec');

exports.check = function (arg0, success, error) {
    exec(success, error, 'ServiceChecker', 'checkGooglePlayService', []);
};
