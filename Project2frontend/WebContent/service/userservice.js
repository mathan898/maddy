/**
 * 
 */
app.factory('UserService',function($http){
	var userService={}
	var BASE_URL="http://localhost:8085/Project2middleware"
		userService.registration=function(user)
		{
		var url=BASE_URL+"/register";
		return $http.post(url,user)
		}
	userService.login=function(user){
		var url=BASE_URL+"/login";
		console.log("user service",url)
		return $http.put(url,user)
	}
	userService.logout=function(){
		var url=BASE_URL +"/logout";
		return $http.put(url)
	}

	return userService;
})