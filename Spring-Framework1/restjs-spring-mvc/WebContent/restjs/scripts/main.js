/*
 * This javaScript source file  
 */

require(["rest/rest","rest/interceptor/mime","jquery"],function(rest,mime,$){
	/*
	 rest({path:'http://localhost:8080/restjs-spring-mve/rest/view'}).then(function(response){
	 console.log('response:',response); 
	 alert("asd");
	 }): */ 
	
	client = rest.chain(mime);
	client({ path : 'http://localhost:8080/restjs-spring-mvc/rest/view'}).then(function(response){
		console.log('response',response);
		$(function(){
			$('#persion-id').text(response.entity.id);
			$('#persion-name').text(response.entity.name); 
	});  // function close

	}); // client close 

}); //require function close
	
