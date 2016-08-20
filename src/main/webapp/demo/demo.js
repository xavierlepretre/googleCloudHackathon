$(document).ready(function() {
  $.getJSON('/demo', function(data) {
    $('#result').html("Hello, " + data.name);
  });
});
