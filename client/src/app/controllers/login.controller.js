(function () {
    'use strict';

    angular
        .module('app')
        .controller('LoginController', LoginController);

    LoginController.$inject = ['$location', 'AuthenticationService'];
    function LoginController($location, AuthenticationService) {
        var loginVm = this;

        loginVm.login = login;

        // (function initController() {
        //     // reset login status
        //     // AuthenticationService.ClearCredentials();
        // })();

        function login() {
            loginVm.dataLoading = true;
            AuthenticationService
                .Login(loginVm.username, loginVm.password)
                .then(function(data) {
                    $location.path('/Movie');
                },function(error){
                    console.log(error);
                    $location.path('/signup');
                })
        }
    }

})();