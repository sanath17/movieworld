(function() {
    'use strict';

    angular
        .module('app', ['ngRoute','ngMessages'])
        .config(moduleConfig)
        .run(moduleRun);

    moduleConfig.$inject = ['$routeProvider'];

    function moduleConfig($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'app/views/Login.tmpl.html',
                controller: 'LoginController',
                controllerAs: 'loginVm'
            })
            .when('/signup', {
                templateUrl: 'app/views/Signup.tmpl.html',
                controller: 'SignupController',
                controllerAs: 'sign'
            })
            .when('/Home', {
                templateUrl: 'app/views/home.tmpl.html',
                controller: 'HomeController'
            })
            .when('/Movies', {
                templateUrl: 'app/views/Movies.tmpl.html',
                controller: 'MovieController',
                controllerAs: 'moviesVm'
            })
            .when('/Movies/:id', {
                templateUrl: 'app/views/movie-detail.tmpl.html',
                controller: 'MovieController',
                controllerAs: 'moviesVm'
            })
            .when('/genere', {
                templateUrl: 'app/views/moviesbygenre.tmpl.html',
                controller: 'MovieController',
                controllerAs: 'moviesVm'
            })
            .when('/title', {
                templateUrl: 'app/views/moviesbytitle.tmpl.html',
                controller: 'MovieController',
                controllerAs: 'moviesVm'
            })
            .when('/imdbRating', {
                templateUrl: 'app/views/moviesbyrating.tmpl.html',
                controller: 'MovieController',
                controllerAs: 'moviesVm'
            })
            .otherwise({
                redirectTo: '/'
            });
    }


    moduleRun.$inject = [];

    function moduleRun() {
        console.log('App Started');
    }
})();