function two_terminal()
{
    //onclick
    var mapsdiv = document.getElementById('mapsdiv') ;
    mapsdiv.style.display = 'block' ;

    var mapview = document.getElementById('mapview') ;
    mapview.src = './tools/command.html' ;
    mapview.style.display = 'block' ;
    mapview.style.width = '100%' ;
    var pageheight = window.innerHeight ;
    mapview.style.height = pageheight - 140 + 'px' ;
    mapview.style.border = 'green solid 2px'
}