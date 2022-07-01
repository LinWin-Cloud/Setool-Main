function new_terminal()
{
    //onmousedown than run this function
    var newbtn = document.getElementById('new') ;
    newbtn.style.backgroundColor = 'white' ;
    newbtn.style.color = 'green' ;
    setTimeout(
        function(){
            newbtn.style.backgroundColor = 'green' ;
            newbtn.style.color = 'white' ;
        } , 100
    )
    window.open('Terminal_PE.html') ;
}