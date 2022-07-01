function onmaps() //if onmouseover
{
    var maps = document.getElementById('maps') ;
    maps.style.backgroundColor = 'green' ;
    maps.style.color = 'black' ;
    maps.onmouseout=function()
    {
        maps.style.backgroundColor = 'black' ;
        maps.style.color = 'green' ;
    }

    maps.onclick=function() //if onclick
    {
        maps.style.backgroundColor = 'darkgrey' ;
        maps.style.color = 'black' ;
        setTimeout(
            function(){
                maps.style.backgroundColor = 'black' ;
                maps.style.color = 'green' ;
            } , 100
        )
        //show the maps
        //server from baidu maps
        var mapsdiv =document.getElementById('mapsdiv') ; //create a id with html dom

        /**
         * the css for the mapsdiv
         */
        var pageheight = window.innerHeight ; //get the webbrowser's height
        mapsdiv.style.height = pageheight - 140 + 'px' ;
        var iframe = document.getElementById('iframe') ;
        iframe.style.height = pageheight - 150 + 'px' ;

        /**
         * the css and script for the map
         */
        var mapsdiv = document.getElementById("mapsdiv") ;
        mapsdiv.style.display = 'block'
        var map = document.getElementById('mapview') ;
        map.style.display = 'block';
        map.style.width = '100%' ;
        map.style.height = pageheight - 140 + 'px' ;
        map.style.border = 'none' ;
        map.src = 'https://maps.baidu.com/@7266336.814991806,373764.0841931496,3z/maptype%3DB_EARTH_MAP'
        maps.onclick = function()
        {
            map.style.display = 'none' ;
        }
    }
}