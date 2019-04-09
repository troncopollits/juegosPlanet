'use strict'

videogames.config(['$locationProvider', function ($locationProvider) {
        $locationProvider.html5Mode(true);
    }]);
videogames.config(['$httpProvider', function ($httpProvider) {
        $httpProvider.defaults.withCredentials = true;
    }]);