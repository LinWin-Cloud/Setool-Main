function settings()
{
    //onmouseover
    var set = document.getElementById('set') ;
    set.style.backgroundColor = 'darkgrey' ;
    setTimeout(function(){
        set.style.backgroundColor = 'black' ;
        set.style.color = 'green'
    } , 100)
    var setth = document.getElementById("setth") ;
    setth.style.display = 'none' ;
    setth.style.display = 'block' ;
}