$(function() {
	$.get('template/article.html', function(template) {
		$.getJSON('rest/articles/1', function(data) {
			var html = Mustache.to_html(template, data);
			console.log('getting articles')
			$("div.main-container").append(html);
		});
	});
});