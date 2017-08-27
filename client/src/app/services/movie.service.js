(function() {

    'use strict';

    angular.module('app')
        .service('MovieService', MovieService);

    MovieService.$inject = ['$http', '$q', 'CONFIG'];
    function MovieService($http, $q, CONFIG) {
        var self = this;
        self.getMovies = getMovies;
        self.getByGenere = getByGenere;
        self.getByTitle = getByTitle;
        self.getTopRatedMovies = getTopRatedMovies;
        self.getById = getById;
        //self.getTopRatedSeries = getTopRatedSeries;

        function getMovies() {
            return $http.get(CONFIG.API_HOST +'/Movie')
                .then(function(response) {
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }
        function getByTitle() {
            return $http.get(CONFIG.API_HOST +'/Movie/title')
                .then(function(response) {
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }
        function getByGenere() {
            return $http.get(CONFIG.API_HOST +'/Movie')
                .then(function(response) {
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }

        function getById(id) {
            return $http.get(CONFIG.API_HOST + '/Movie/'+id)
                .then(function (response) {
                    console.log("movie by id:"+response.data);
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }

        function getTopRatedMovies() {
            return $http.get(CONFIG.API_HOST + '/Movie/ratings')
                .then(function (response) {
                    console.log("Top rated movies");
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }

        // function getTopRatedSeries() {
        //     return $http.get(CONFIG.API_HOST + '/movies/topSeries')
        //         .then(function (response) {
        //             console.log("Top rated tv shows");
        //             return response.data;
        //         }, function(response) {
        //             return $q.reject('ERROR: ' + response.statusText);
        //         });
        // }

    }
})();