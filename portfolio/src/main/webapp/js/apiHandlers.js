$(function() {
	$.get('template/Article.html', function(template) {
		$.getJSON('rest/articles/1', function(data) {
			var html = Mustache.to_html(template, data);
			console.log('getting articles')
			$("div.article-container").append(html);
		});
	});
});