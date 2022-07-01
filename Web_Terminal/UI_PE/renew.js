function renew()
{
    //onmousedown than run this function
    var renew = document.getElementById('renew') ;
    renew.style.backgroundColor = 'white' ;
    renew.style.color = 'green' ;
    setTimeout(
        function(){
            renew.style.backgroundColor = 'green' ;
            renew.style.color = 'white' ;
        } , 100
    )
    window.location.href = '' ;
}