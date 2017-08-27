(function () {
    'use strict';

    angular.module('app')
        .service('userService', userService);

    userService.$inject = ['$http', '$q'];
    function userService($http, $q) {
        var self = this;
            
        self.checkUser = checkUser;

        function checkUser(email) {
            return $http.get('http://localhost:8080/MovieworldSpringApi/api/movie')
                .then(function (response) {
                    return response.data;
                }, function(response) {
                    return $q.reject('ERROR: ' + response.statusText);
                });
        }

    }
})();