function about()
{
    //onclick

    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.display = 'block' ;

    var aboutwindow = document.getElementById("aboutwindow") ;
    
    var pageheight = window.innerHeight ;

    aboutwindow.style.height = pageheight - 100 + 'px'

    //close window
    var closeaboutth =document.getElementById('closeaboutth') ;
    closeaboutth.onclick = function()
    {
        aboutth.style.display = 'none' ;
    }
}
