(function() {

    'use strict';

    angular
        .module('app')
        .controller('MovieController', MovieController);

    MovieController.$inject = ['MovieService', '$routeParams'];
    function MovieController(MovieService, $routeParams) {
        var moviesVm = this;
        init();

        moviesVm.changeSort = changeSort;
        moviesVm.getMovies = getMovies;
        moviesVm.getByTitle = getByTitle;
        moviesVm.getByGenere = getByGenere;
        moviesVm.getTopRatedMovies = getTopRatedMovies;
        moviesVm.getById = getById;

        function init() {
            console.log("List of Movies");
        }

        moviesVm.sorter = {
            by: 'year',
            reverse: false
        }

        function changeSort(prop) {
            moviesVm.sorter.by = prop;
            moviesVm.sorter.reverse = !moviesVm.sorter.reverse;
        }
        function getMovies() {
            MovieService
                .getMovies()
                .then(function(movies) {
                    moviesVm.movies= movies;
                    console.log(moviesVm.movies);
                }, function(error) {
                    console.log(error);
                });
        }

        function getByTitle() {
            MovieService
                .getByTitle()
                .then(function (title) {
                    moviesVm.title = title;
                    console.log(moviesVm.title);
                }, function (error) {
                    console.log(error);
                })
        }

        function getByGenere() {
            MovieService
                .getByGenere()
                .then(function(movie) {
                    return moviesVm.movie.genere === "%Crime%";
                }, function (error) {
                    console.log(error);
                });
        }

        function getTopRatedMovies() {
            MovieService
                .getTopRatedMovies()
                .then(function (movies){
                    moviesVm.movies = movies;
                }, function (error) {
                    console.log(error);
                });
        }
        function getById(id) {
            MovieService
                .getById($routeParams.id)
                .then(function (movie){
                    moviesVm.movie = movie;
                }, function (error) {
                    console.log(error);
                });
        }

        // function getTopRatedSeries() {
        //     MovieService
        //         .getTopRatedSeries()
        //         .then(function (series){
        //             moviesVm.series = series;
        //         }, function (error) {
        //             console.log(error);
        //         });
        // }
    }
})();