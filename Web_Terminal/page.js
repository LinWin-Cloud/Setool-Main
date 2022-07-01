window.onload = function()
{
    var mapsdiv = document.getElementById('mapsdiv') ;
    mapsdiv.style.display = 'none' ;

    var aboutth = document.getElementById('aboutth') ;
    aboutth.style.display = 'none' ;

    var helpwindow = document.getElementById('helpwindow') ;
    var pageheight = window.innerHeight ;
    helpwindow.style.height = pageheight - 100 + 'px' ;

    var helpth = document.getElementById('helpth') ;
    helpth.style.display = 'none' ;


    var two = document.getElementById('two') ;
    two.onmouseover = function(){
        two.style.backgroundColor = 'green' ;
        two.style.color = 'black' ;
        two.onmouseout = function(){
            two.style.backgroundColor = 'black' ;
            two.style.color = 'green' ;
        }
    }

    var viewth = document.getElementById("viewth") ;
    var setth = document.getElementById('setth') ;
    setth.style.display = 'none' ;
    viewth.style.display = 'none' ;

    var iframe=document.getElementById('iframe') ;
    var pageheight = window.innerHeight ;
    iframe.style.height = pageheight - 140 + 'px' ;

    var set=document.getElementById("set");
    set.onmouseover = function(){
        set.style.backgroundColor = 'green' ;
        set.style.color = 'black'
        set.onmouseout=function(){
            set.style.backgroundColor = 'black';
            set.style.color = 'green'
        }
    }

    var view=document.getElementById("view");
    view.onmouseover = function(){
        view.style.backgroundColor = 'green' ;
        view.style.color = 'black'
        view.onmouseout=function(){
            view.style.backgroundColor = 'black';
            view.style.color = 'green'
        }
    }

    var help=document.getElementById("help");
    help.onmouseover = function(){
        help.style.backgroundColor = 'green' ;
        help.style.color = 'black'
        help.onmouseout=function(){
            help.style.backgroundColor = 'black';
            help.style.color = 'green'
        }
    }

    var about=document.getElementById("about");
    about.onmouseover = function(){
        about.style.backgroundColor = 'green' ;
        about.style.color = 'black'
        about.onmouseout=function(){
            about.style.backgroundColor = 'black';
            about.style.color = 'green'
        }
    }
    var map = document.getElementById('mapview') ;
    map.style.display = 'none' ;
    var terminal=document.getElementById("terminal");
    var pagewidth = window.innerWidth;
    var pageheight = window.innerHeight;
    terminal.style.width = pagewidth - 100 + 'px';
    terminal.style.height = pageheight - 20 + 'px';
    var running=document.getElementById("running");
    running.style.height = pageheight - 140 + 'px'
}