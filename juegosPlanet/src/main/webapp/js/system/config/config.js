'use strict'

wildcart.config(['$locationProvider', function ($locationProvider) {
        $locationProvider.html5Mode(true);
    }]);
wildcart.config(['$httpProvider', function ($httpProvider) {
        $httpProvider.defaults.withCredentials = true;
    }]);