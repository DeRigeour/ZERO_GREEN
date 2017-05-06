var app = angular.module('StarterApp', ['chart.js']);

app.controller('AppCtrl', ['$scope', function($scope){
  $scope.labels = ["Kitchen Waste", "Garden Waste", "Office Waste" , "Lunch Waste" , "Class Room Waste " , "Toilet Rooms"];
  $scope.data = [300, 500, 100 , 300 , 200, 300];
  $scope.options = {
    tooltipEvents: [],
    showTooltips: true,
    tooltipCaretSize: 0,
    onAnimationComplete: function () {
        this.showTooltip(this.segments, true);
    },
};
    
}]); 