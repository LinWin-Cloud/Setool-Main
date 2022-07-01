function view() //onmouseover
{
    var view = document.getElementById('view') ;
    view.style.backgroundColor = 'white' ;
    view.style.color = 'green' ;
    setTimeout(
        function()
        {
            view.style.backgroundColor = 'green' ;
            view.style.color = 'white' ;
        } , 100
    )
    function start_view_th()
    {
        var viewth = document.getElementById('viewth') ;
        viewth.style.display = 'block' ;
        return true
    }
    start_view_th()
    return true
}
function close_view_th(){
    var viewth = document.getElementById('viewth') ;
    viewth.style.display = 'none' ;
    return true
}
function pc_view(){
    //change the view is PC
    window.location.href = 'Terminal_PC.html' ;
    return true
}
function pe_view(){
    //change the view is PE
    window.location.href = '' ;
    return true
}