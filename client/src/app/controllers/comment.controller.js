var Commments = [];
(function() {
    'use strict';

    angular
        .module('app')
        .controller('CommentController', CommentController);

    CommentController.$inject = ['$http'];

    function CommentController($http) {
        var Vm = this;

        Vm.my = {};
        Vm.my.comment = '';
        Vm.initialize = initialize;

        function initialize() {
            Comments.push(Vm.my.comment);
            sessionStorage.setItem("commentdata", JSON.stringify(Comments));
            console.log(angular.toJson(Vm.my));
            $http.put('http://localhost:8080/movieworldSpringApi/api/userreview/'+id, angular.toJson(Vm.my))
                .success(function (response) {
                    console.log(response);
                });
        }
    }

})();var Commments = [];
(function() {
    'use strict';

    angular
        .module('app')
        .controller('CommentController', CommentController);

    CommentController.$inject = ['$http'];

    function CommentController($http) {
        var Vm = this;

        Vm.my = {};
        Vm.my.comment = '';
        Vm.initialize = initialize;

        function initialize() {
            Comments.push(Vm.my.comment);
            sessionStorage.setItem("commentdata", JSON.stringify(Comments));
            console.log(angular.toJson(Vm.my));
            $http.put('http://localhost:8080/movieworldSpringApi/api/userreview/'+id, angular.toJson(Vm.my))
                .success(function (response) {
                    console.log(response);
                });
        }
    }

})();







