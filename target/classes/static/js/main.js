
$(document).ready(function () {

    $("#bth-search").click(function (event) {
        fire_ajax_submit();
    });
     $("#btn-click").click(function (event) {
           window.open("next","_self")
           onloadDat();
     });

});
$(function() {

  $('input[name="datefilter"]').daterangepicker({
      autoUpdateInput: false,
      locale: {
          cancelLabel: 'Clear'
      }
  });

  $('input[name="datefilter"]').on('apply.daterangepicker', function(ev, picker) {
      $(this).val(picker.startDate.format('MM/DD/YYYY') + ' - ' + picker.endDate.format('MM/DD/YYYY'));
  });

  $('input[name="datefilter"]').on('cancel.daterangepicker', function(ev, picker) {
      $(this).val('');
  });

});
$('.dataTable').on('click', 'tbody tr', function() {
    alert("click");
  console.log('API row values : ', table.row(this).data());
})
function fire_ajax_submit() {

    var search = {}
employee("table-id","employeesTable")



}
function employee(divid,tableid){
debugger;
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
           $("#table-id1").empty();
           createTable("table-id1",data.tableID);
           var datatable    =  $("#"+data.tableID).DataTable ({
                  "destroy": true,
                  "scrollX": true,
                  "scrollY": "200px",
                     "sort":true,
                     "data" : data.dataList,
                     "columns" :data.columnsList
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

    function createTable(divId, tableId){

    var table = $("<table id="+tableId+">");
      $("#"+divId).append(table);
    }

}