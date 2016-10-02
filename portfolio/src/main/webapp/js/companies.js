$(function() {
	$.get('template/company.html', function(template) {
		$.getJSON('rest/companies/1', function(data) {
			var html = Mustache.to_html(template, data);
			$.get('template/project.html', function(template2) {
				$("div.job-container").append(html);
				for (i in data.projects){
					html = Mustache.to_html(template2, data.projects[i])
					console.log(html)
					$("div.project-container").append(html);
				}
			});
		});
	});
});