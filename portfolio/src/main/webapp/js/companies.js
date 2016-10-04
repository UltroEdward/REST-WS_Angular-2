
$(function() {
	$.get('template/company.html', function(compTempl) {
		$.getJSON('rest/companies', function(companiesJson) {
			$.get('template/project.html',function(prTempl) {
						console.log(companiesJson)
						for ( var comp in companiesJson) {
							var html = Mustache.to_html(compTempl,companiesJson[comp]);
							$("div.job-container").append(html);
							for (var i in companiesJson[comp].projects) {
								console.log(companiesJson[comp].projects);
								html = Mustache.to_html(prTempl,companiesJson[comp].projects[i])
								$("div.project-container").append(html);
							}
						}
					});
		});
	});
});