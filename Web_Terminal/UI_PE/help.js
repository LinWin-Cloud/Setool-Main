function help() //onmouseover
{
    var help = document.getElementById('help') ;
    help.style.backgroundColor = 'white' ;
    help.style.color = 'green' ;
    setTimeout(
        function()
        {
            help.style.backgroundColor = 'green' ;
            help.style.color = 'white' ;
        } , 100
    )
    help.onclick = function(){
        var helpth = document.getElementById('helpth') ;
        helpth.style.display = 'block' ;
    }
}
function closehelp()
{
    var helpth = document.getElementById('helpth') ;
    helpth.style.display = 'none' ;
}