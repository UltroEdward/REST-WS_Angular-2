
$(function() {
	$.get('template/company.html', function(compTempl) {
		$.getJSON('rest/companies', function(companiesJson) {
			$.get('template/project.html',function(prTempl) {
						for ( var comp in companiesJson) {
							var companyHtml = Mustache.to_html(compTempl,companiesJson[comp]);
							console.log("id is: "+ comp)
							$("div.job-container").append("<div id="+comp+"> </div>");
							$("div.job-container div#"+comp).append(companyHtml);
							for (var i in companiesJson[comp].projects) {
								console.log(companiesJson[comp].projects);
								projectHtml = Mustache.to_html(prTempl,companiesJson[comp].projects[i])
								$("div#"+comp+" div.project-container").append(projectHtml);
							}
						}
					});
		});
	});
});