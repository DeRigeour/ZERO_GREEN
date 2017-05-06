
app.controller("BookStore", function($scope , $http)
	 {

	  $http.get('http://localhost:8084/greenFacilityInchargeInfo').
        then(function(response) {
          $scope.inchargeItems = response.data;
       });

	  $scope.saveFacilityIncharge= function( index){

		   // alert( $scope.inchargeItems[index].facilityGreenTeamInfo.email);
			var jsonData = angular.toJson($scope.inchargeItems[index]) ;
			alert(jsonData );

            $http.post('http://localhost:8084/updateGreenFacilityInchargeInfo', jsonData)
            .success(function(data){
                alert(data);
            })
            .error(function(data){
                alert("Error"+data);
            })
        }

	//	$scope.items = [
		//	{ISBN:"5674789", Name: "Asp.Net MVC", Price: 560, Quantity: 20},
			//{ISBN:"4352134",Name: "AngularJSing", Price: 450, Quantity: 25},
	//		{ISBN:"2460932",Name: "Javascript", Price: 180, Quantity: 15}
	//	];

    $scope.editing = false;
		$scope.addItem = function(item) {
  //  $scope.item = {};
    $scope.inchargeItems.splice(0, 0, $scope.item);

  	//	$scope.inchargeItems.push($scope.item);
   		$scope.item = {};
    //  var len = $scope.inchargeItems.length - 1;
      $scope.saveFacilityIncharge(0);
		}

		$scope.totalPrice = function(){
			var total = 0;
		//	for(count=0;count<$scope.items.length;count++){
			//	total += $scope.items[count].Price*$scope.items[count].Quantity;
		//	}
			return total;
		}

		$scope.removeItem = function(index){
			$scope.inchargeItems.splice(index,1);
		}
		$scope.editItem = function(index){

			 $scope.editing = $scope.inchargeItems.indexOf(index);

		}
		 $scope.saveField = function(index) {
        if ($scope.editing !== false) {
			$scope.editing = false;
        }
    };

    $scope.cancel = function(index) {
        if ($scope.editing !== false) {
            $scope.editing = false;
        }
    };
	}
	);
