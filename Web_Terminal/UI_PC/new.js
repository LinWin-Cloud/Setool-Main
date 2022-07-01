function onnew()
{
    var ne = document.getElementById('new') ;
    ne.style.backgroundColor = 'green' ;
    ne.style.color = 'black' ;
    ne.onmouseout=function()
    {
        ne.style.backgroundColor = 'black' ;
        ne.style.color = 'green' ;
    }
    ne.onclick = function()
    {
       console.log('[*]New Terminal')
       window.open ('Terminal_PC.html') ;
    }
}