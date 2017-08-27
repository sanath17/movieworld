(function () {
    'use strict';

    angular
        .module('app')
        .service('AuthenticationService', AuthenticationService);

    AuthenticationService.$inject = ['$http', '$q']

        function AuthenticationService($http, $q) {
            var self = this;

            self.Login = Login;

            function Login(username, password) {
                return $http.get('http://localhost:8080/MovieworldSpringApi/api/Movie', {
                    username: username,
                    password: password
                })
                    .then(successFn, errorFn);
            }

            function successFn(response) {
                return response.data; 
            }

            function errorFn(response) {
                return $q.reject(error.status); 
            }
        
        }


})();

