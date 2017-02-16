store = {
		
		tags: ["java", "sql", "javascript"],
		slides: [
			{title: "hello slider", body:"slide body", tag:"java"}, 
			{title:"another slide", body:"<h1>another body</h1><br /><p>par</p>", tag:"java"},
			{title:"another slide", body:"<h1>another body</h1><br /><p>par</p>", tag:"java"}],
		activeSlide: 1,
		activeTag: 0
};


$.ajax({
	url: 'http://localhost:8080/webapp/Slide',
	success: function(a,b,c){
		for(i=0;i<a.length;i++){
			store.slides[i].title = a[i].title;
			store.slides[i].body= a[i].body;
			//store.slides[i].tag= a[i][0].name;
		}
	},
	error: function(a,b,c){
		alert('error');
	}
});




function loadSlide(num){
	
	store.activeSlide=num;
	
	var title = store.slides[num].title;
	var body = store.slides[num].body;
	
	// Manipolare il dom affinche visualizzi il risultato di questa  cosa
	
	var obj = $('#title').html(title);
	
	
	
	$('#body').html(body);
	
}

function tagChange(){
	var tag = event.target.innerHTML;
	
	$('#tagTitle').html(tag);
}


function prev(){
	
	if (store.activeSlide==0){
		return;
	}
	
	
	loadSlide(store.activeSlide-1);
		
}

function next(){
	if(store.activeSlide==store.slides.length-1){
		return;
	}
	
	
	loadSlide(store.activeSlide+1);
}


function saveSlide(){
	
	var slide = {
			title: $('#titleSlide').val(),
			body: $('#bodySlide').val()
	};
	
	
	store.slides.push(slide);
}




loadSlide(1);


$(document).ready(function(){
	// <li></li>
	for(i=0;i<store.tags.length;i++){
		$('#tags').append('<li><a href="#" onclick="tagChange()">' + store.tags[i]  + '</a></li>');
	}
	
});


$('#exampleModal').on('show.bs.modal', function (event) {
	  var button = $(event.relatedTarget) // Button that triggered the modal
	  var recipient = button.data('whatever') // Extract info from data-* attributes
	  // If necessary, you could initiate an AJAX request here (and then do the updating in a callback).
	  // Update the modal's content. We'll use jQuery here, but you could use a data binding library or other methods instead.
	  var modal = $(this)
	  modal.find('.modal-title').text('New message to ' + recipient)
	  modal.find('.modal-body input').val(recipient)
	});



