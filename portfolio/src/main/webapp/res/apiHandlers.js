$(function() {
	$
			.getJSON(
					'rest/articles/1',
					function(data) {
						console.log(data);
						var name = data.name;
						console.log(name);
						var article = '<div class="row"><div class="col-md-6 col-md-offset-3"><div class="thumbnail"><h3 style="text-align: center;">{{name}}</h3><div class="row"><div class="col-md-5 "><img src="{{path_to_pic}}"><div class="caption"></div></div><div class="col-md-5 col-md-offset-1"><p>{{text_short}}<p><a class="btn btn-primary" role="button">Button</a></p></div><div class="col-md-1"></div></div></div></div></div>'
						var data = {
							name : data.name,
							path_to_pic : data.pathToMainPic,
							text_short : data.shortDescription
						};
						var html = Mustache.to_html(article, data);
						console.log(html);
						$("div.article-container").append(html);
					});
});
