
$(document).ready(function () {
alert(window.opener.selectedDate);
alert(window.selectedDate);
onloadDat();
});

function onloadDat(){
var search = {};
$.ajax({
type: "POST",
contentType: "application/json",
url: "/api/search",
data: JSON.stringify(search),
dataType: 'json',
cache: false,
timeout: 600000,
success: function (data) {
debugger;
$("#table-id2").show();
var jsonString = JSON.stringify(data)
var oTblReport = $("#logerrorid")

oTblReport.DataTable ({
"destroy": true,
"data" : data,
"columns" : [
{ "data" : "id" },
{ "data" : "name" },
{ "data" : "lastName" },
{ "data" : "email" },
{ "data" : "phone" },
{ "data" : "active" }
]
});
},
error: function (e) {

var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
$('#feedback').html(json);

console.log("ERROR : ", e);
$("#btn-search").prop("disabled", false);

}
});
}