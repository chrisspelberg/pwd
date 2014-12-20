"use strict";

var pwdApp = angular.module('pwdApp', []);

pwdApp.controller('HomeController', function ($scope) {

    $scope.currentUser = {
        'id': 'CAFEBABE',
        'name': 'current',
        'emailAddress': 'current@user.local',
        'fullName': 'Current User'
    }


});