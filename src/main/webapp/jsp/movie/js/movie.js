/**
 * 
 */

$document.ready(function(){
	$.ajax({
		url:"http://localhost:8080/getAllMovies"
	}).then(function(data){
		$('.mname').append(data.name);
		$('.mdescription').append(data.description);
	});
});