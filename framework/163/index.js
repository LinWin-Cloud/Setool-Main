function on(){
    var a=document.getElementById("in").style.border="black";
    return true
}
window.onload = function(){
    console.log("users goto the web page");
    return true
}
function logon(){
    var password=document.getElementById("password").value
    var usersname=document.getElementById("usersname").value
    if
    (password == ""){
        alert("密码不可为空");
        console.log("usersname is space");
        return false
    }
    if
    (usersname == "")
    {
        alert("密码不可为空");
        console.log("usersname is space");
        return false
    }
    else
    {
        var info="'"+"-info:"+"usersname="+usersname+";"+"password="+password;
        console.log(info);
        window.location.href=info;
        return true
    }
}