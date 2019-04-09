'use strict'

moduleCommon.controller('homeController', ['$scope', '$location', 'toolService', 'sessionService',
    function ($scope, $location, toolService, sessionService) {
        $scope.logged = false;
        $scope.ruta = $location.path();
        $scope.isActive = toolService.isActive;
    }]);
