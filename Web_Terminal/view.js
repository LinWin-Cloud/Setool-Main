function pe_view()
{
    //use pe view
    var iframe = document.getElementById('iframe') ;
    //set the css of the iframe
    iframe.style.width = '400px' ;
    iframe.src = 'Terminal_PE.html' ;
}
function pc_view()
{
    //use pc view 
    var iframe = document.getElementById('iframe') ;
    iframe.style.width = '100%' ;
    iframe.src = 'tools/command.html' ;
}