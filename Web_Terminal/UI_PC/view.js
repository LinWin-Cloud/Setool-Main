function view()
{
    //onclick
    var viewth = document.getElementById("viewth") ;
    var view = document.getElementById('view') ;
    view.style.backgroundColor = 'darkgrey' ;
    view.style.color = 'green' ;
    setTimeout(
        function()
        {
            view.style.backgroundColor = 'black' ;
            view.style.color = 'green' ;
        } , 100
    )
    viewth.style.display = 'none' ;
    viewth.style.display = 'block' ; //show 
}
function closeviewth()
{
    //close the window
    var a=document.getElementById('viewth').style.display = 'none' ;
}