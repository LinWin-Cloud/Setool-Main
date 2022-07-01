function settings() //onmousedwon
{
    var set = document.getElementById('set') ;
    set.style.backgroundColor = 'white' ;
    set.style.color = 'green' ;
    setTimeout(
        function()
        {
            set.style.backgroundColor = 'green' ;
            set.style.color = 'white' ;
        } , 100
    )
    function start_set_window()
    {
        var setth = document.getElementById('setth') ;
        setth.style.display = 'block' ;
        return true ;
    }
    start_set_window() //run this function
    return true
}
function close_set_window() //close the setting window
{
    console.log ('[*]Close the Setting Window')
    var setth = document.getElementById('setth') ;
    setth.style.display = 'none' ;
    return true
}
function color_white(){
    //change the color is white
    var topdiv = document.getElementById('topdiv') ;
    topdiv.style.border = 'white' ;

    var iframe  = document.getElementById('iframe') ;
    iframe.style.border = 'white solid 10px' ;

    var setth = document.getElementById('setth') ;
    setth.style.border = 'white solid 10px' ;

    var viewth = document.getElementById('viewth') ;
    viewth.style.border = 'white solid 10px' ;

    var helpth = document.getElementById('helpth') ;
    helpth.style.border = 'white solid 10px' ;

    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.border = 'white solid 10px' ;
}
function color_green(){
    //change the color is white
    var topdiv = document.getElementById('topdiv') ;
    topdiv.style.border = 'green' ;

    var iframe  = document.getElementById('iframe') ;
    iframe.style.border = 'green solid 10px' ;

    var setth = document.getElementById('setth') ;
    setth.style.border = 'green solid 10px' ;

    var viewth = document.getElementById('viewth') ;
    viewth.style.border = 'green solid 10px' ;

    var helpth = document.getElementById('helpth') ;
    helpth.style.border = 'green solid 10px' ;

    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.border = 'green solid 10px' ;
}