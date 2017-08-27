(function() {
    'use strict';

    angular.module('app')
        .controller('HomeController', HomeControllerFn);

    HomeControllerFn.$inject = [];

    function HomeControllerFn() {
        console.log('working in home controller');
    }
});