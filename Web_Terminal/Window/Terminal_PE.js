window.onload = function()
{
    var iframe = document.getElementById("iframe") ;
    var pageheight = window.innerHeight ;
    var pagewidth  = window.innerWidth ;
    iframe.style.height = pageheight - 130 + 'px' ;
    iframe.style.border = 'green solid 10px' ;
    iframe.style.width = pagewidth - 20 + 'px' ;

    var setth = document.getElementById('setth') ;
    setth.style.display = 'none' ;
    setth.style.width = pagewidth - 20 + 'px' ;

    var viewth = document.getElementById('viewth') ;
    viewth.style.width = pagewidth - 20 + 'px' ;
    viewth.style.display = 'none' ;

    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.display = 'none' ;
}