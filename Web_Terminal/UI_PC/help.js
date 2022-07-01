
/**
 * if onclick the help
 * than run this function
 */
function help()
{
    var helpth = document.getElementById('helpth') ;
    helpth.style.display = 'block' ;
    
    var help = document.getElementById('help') ;
    help.style.backgroundColor = 'darkgrey' ;
    help.style.color = 'green' ;
    setTimeout(
        function()
        {
            help.style.backgroundColor = 'black' ;
            help.style.color = 'green' ;
        } , 100
    )
    var closehelpth = document.getElementById('closehelpth') ;
    closehelpth.onclick = function()
    {
        helpth.style.display = 'none' ;
    }
}