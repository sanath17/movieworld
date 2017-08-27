(function () {
    'use strict';

    angular
        .module('app')
        .controller('SignupController',SignupController);

    SignupController.$inject = ['$http','$location'];

    function SignupController ($http,$location)
    {
        var List = [];
        var sign = this;
        sign.newuser = {};
        sign.ssoId = '';
        sign.newuser.firstname = '';
        sign.newuser.lastname = '';
        sign.newuser.email = '';
        sign.newuser.password = '';
        sign.create = create;

        function create() {

            List.push(sign.newuser);
            sessionStorage.setItem("userdata", JSON.stringify(List));
            console.log(angular.toJson(sign.newuser));
            $http.post('http://localhost:8080/MovieworldSpringApi/api/users/register', angular.toJson(sign.newuser))
                    $location.path('/login');

        }
    }
})();
