function about() //onmouseover
{
    var about = document.getElementById('about') ;
    about.style.backgroundColor = 'white' ;
    about.style.color = 'green' ;
    setTimeout(
        function()
        {
            about.style.backgroundColor = 'green' ;
            about.style.color = 'white' ;
        } , 100
    )
    about.onclick = function(){
        var aboutth = document.getElementById('aboutth') ;
        aboutth.style.display = 'block' ;
    }
}
function closeabout(){
    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.display = 'none' ;
}