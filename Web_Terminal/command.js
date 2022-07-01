function show_command(content) //put the content to the terminal
{
    var newnode = document.getElementById('command') ;
    var createnode = document.createElement('node') ;
    createnode.innerHTML = content
    newnode.appendChild(createnode) ;
    document.getElementById('in').value = '' ; //clear the value in the inpurbox
}
function shodan_search()
{
    var search_command = prompt('[*]Input Shodan Command To Search:')
    if (search_command == null)
    {
        console.log('[!]Null')
        document.getElementById('in').value = '' ;
        return false
    }
    else
    {
        console.log('[*]Search:'+search_command) ;
        //use shodan search api
        window.open('https://www.shodan.io/search?query='+search_command) ;
        document.getElementById('in').value = '' ;
        return true
    }
}
function web_site_goto()
{
    var url = prompt ('[*]Input URL to go:')
    if(url == null){return false}
    else{
        window.open(url) ;
        console.log('[!]Goto URL:'+url) ;
        return true
    }
}
function git_gitee(){
    var users = prompt ('[*]Input the gitee usersname:[Usersname]')
    if (users == null){return false}
    else
    {
        var host = prompt ('[*]Input the Warehouse Name:[Warehouse]')
        if(host == null){ return false }else{
            console.log('URL:'+'https://gitee.com/'+users+'/'+host) ;
            window.open ('https://gitee.com/'+users+'/'+host) ;
            var content = "<p style='color:yellow'>[!]Goto The Warehouse:"+'https://gitee.com/'+users+'/'+host+"</p>" ;
            show_command(content)
            return true
        }
    }
}
function git_github(){
    var users = prompt('[*]Input the github usersname:[Usersname]')
    if(users == null)
    {
        return false
    }else{
        //the value is not null
        var host = prompt('[*]Input the Warehouse Name:[Warehouse]')
        if (host == null) //if the value than qiut
        {
            return false
        }else{
            var gotogithub = 'https://github.com/' + users + '/' + host ;
            console.log(gotogithub) ;
            window.open (gotogithub) ; //goto the github
            return true
        }
    }
}
function color_white()
{
    var a=document.getElementById('command') ;
    a.style.color = 'white' ;

    var b=document.getElementById('in') ;
    b.style.color = 'white' ;

    var c=document.getElementById('sh') ;
    c.style.color = 'white' ;
    document.getElementById('in').value = '' ; //clear the value in the inputbox
}
function color_green(){
    var a=document.getElementById('command') ;
    a.style.color = 'green' ;

    var b=document.getElementById('in') ;
    b.style.color = 'green' ;

    var c=document.getElementById('sh') ;
    c.style.color = 'green' ;
    document.getElementById('in').value = '' ; //clear the value in the inputbox
}
function shell_get()
{
    for (i = 1 ; i <= 1 ; i++)
    {
        var url1 = ["https://gitee.com/LinWin-Cloud/<br />" , "https://github.com/LinWin-Cloud/"] ;
        show_command(url1) ;
    }
}
/**
 * use bing search engnering 
 * Microsoft Bing
 */
function bing_harker()
{
    //use www.bing.com search engnering
    var search = prompt ('[*]Enter The Search Command:') ;
    if (search == null){
        //qiut the input
        return false
    }else{
        for (i = 1 ; i <= 1 ; i++){
            console.log ('Search:' + search) ; //print the input
            window.open ('https://cn.bing.com/search?q=' + search) ;//Bing Search API
            setTimeout(
                function(){
                    var content = "<p style='color:yellow'>[*]Use Bing Harker</p>" ;
                } , 300)
            return true
        }
    } ;
}
function baidu_harker(){
    //baidu harker 
    //search server from baidu
    var search = prompt ('[*]Enter The Search Command:') ;
    console.log ('Search:'+search) ;
    if (search == null){
        return false
    }else{
        //use baidu API 
        window.open ('https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd='+search) ;
        return true
    } ;
} ;
function sogou_search(){
    //sogou search
    var search = prompt ('[*]Enter The Search Command:') ;
    console.log ('Search:'+search) ;
    if (search == null){
        return false
    }else{
        //use sogou API 
        window.open ('https://www.sogou.com/web?query='+search) ;
        return true
    } ;
}
function search_show(){
    var l1 = "<p style='color:yellow'>1:Bing;;;;;;Enter:use search_harker:bing" ;
    var l2 = "<p style='color:yellow'>2:Baidu;;;;;Enter:use search_harker:baidu" ;
    var l3 = "<p style='color:yellow'>3:Sogou;;;;;Enter:use search_harker:sogou" ;
    setTimeout(function(){
        show_command(l1) ;
        setTimeout(function(){show_command(l2) ;setTimeout(
            function()
            {
                show_command(l3) ;  
            } , 100)} , 100)
    } , 100)
}
function search_ip(){
    var ip = prompt ("[*]Search IP:")
    console.log("Search IP:"+ip) ;
    if (ip == null){return false ;}
    else{
        /**
         * use www.ip.cn's API
        */
        window.open('https://www.ip.cn/ip/' + ip + '.html') ;
        return true
    } ;
} ;
function get_time(){
    /**
     * get the time on the system
    */
    var time = new Date() ; //get the time on this OS
    /**
     * get time
    */
    var My_Year = time.getFullYear() ;
    var My_Mouth = time.getMonth() ;
    var My_Day = time.getDay() ;
    var My_Hour = time.getHours() ;
    var My_Minute = time.getMinutes() ;
    var My_Second = time.getSeconds() ;
    
    a = My_Mouth ;
    RealMouth = a + 1 ;
    var Fulltime = [ 
        My_Year + 'Year', +
        RealMouth + 'Mouth', +
        My_Day  + 'Day', +
        My_Hour + 'Hour', +
        My_Minute + 'Minute', +
        My_Second + 'Seacond',
    ] ;
    console.log(Fulltime) ;
    show_command(Fulltime) ; //show the timeJ
}
function send_email(){
    //send email to the target
    //use email html
    for (i = 1 ; i <= 1 ; i++){
        var target = prompt ('[*]Enter the Target:') ;
        var content = "<p style='color:yellow'>Send Target:"+target+"</p>" ;
        show_command(content) ;
        var subject = prompt ('[*]Enter a subject:') ;
        show_command("<br />"+subject) ;
        var con = prompt ('Content:') ; //write the content to send 
        show_command('<br />'+con) ;
        setTimeout(
            function(){
                var content = '<br />Wait... ...' ;
                show_command(content) ;
            } , 300
        ) 
    } ; 
    var sendurl = "<a href='mailto:"+target+"?subject="+subject+"?body="+con+"'>Send E-Mail:"+target+"</a>" ;
    console.log('SendURL:' + sendurl) ;
    listsend = [
        'target:' + target ,
        'Subject:' + subject ,
        'Content:' + con ,
    ] ;
    console.log(listsend) ;
    show_command(listsend) ;
    show_command('<br />') ;
    setTimeout(
        function(){
            show_command('<br />'+sendurl) ;
        } , 400
    )
}
function send_sms(){
    //send sms to the target
    var target = prompt ('[*]Enter Target:') ;
    show_command(target+"<br />") ;
    for (i = 1 ; i <= 1 ; i++){
        var con = prompt ('[*]Enter Content:') ;
        //make a list of the information
        sendurl = [
            'Target:' + target ,
            'Content:' + con ,
        ] ; 
        console.log (sendurl) ;
        show_command(sendurl) ;
        function make_url(){
            //make a url to send 
            var url_to_send = "<a href='sms:"+target+'?body='+con+"'>SendURL:"+target+"</a>" ;
            show_command(url_to_send) ;
            console.log('MAKEURL:'+url_to_send) ;
        } ;
        make_url() ; //run this function
    }
}
function run_javascript(){
    for (i = 1  ; i <= 1 ; i++){
   	var run_command = prompt ('[*]Enter the JavaScript:') ;
	if (run_command == null){
	    //exit
	    return ;
	}else{
	    //next
	    var run = document.getElementById('run') ;
	    run.innerHTML = run ; //run the javascript
	    return true
	}
    }
}
function get_location(){
    if(navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            function(position) {
                let getLongitude = position.coords.longitude; 
                let getLatitude = position.coords.latitude;    
                console.log(getLongitude) ;
                console.log(getLatitude) ;
                list_location = [
                    'Longitude:' + getLongitude ,
                    'Latitude:' + getLatitude ,
                ] ;
                show_command('Longitude:' + getLongitude + '<br />') ;
                show_command('Latitude:' + getLatitude + '<br />') ;
            },
            //on error
            function(error) {
                var errorType = ['You refuse to share location information', 'Location information is not available', 'Get location information timed out'];
                alert(errorType[error.code - 1]);
            }
        );
    } ;
}
function get_sysinfo(){
    var sysinfo = navigator.userAgent.toLowerCase();
    console.log(sysinfo) ;
    show_command("<p style='color:yellow'>"+sysinfo+"</p>") ;
} ;
function get_my_system(){
    var system = navigator.oscpu ;
    console.log(system) ;
    show_command('Your System='+system) ;
} ;
function get_help(){
    //show all the command to the users
    
    /**
     * the command list
     */
    s  = "<br />" //space
    l1 = '1;help'+';;Get the help'+s ;
    l2 = '2;get my_language'+';;Get the System Language' +s ;
    l3 = '3;exit'+";;exit the web shell"+s ;
    l4 = '4;get my_system'+';;get the OS info'+s ;
    l5 = '5;get my_sysinfo'+';;get the system information' +s ;
    l6 = '6;get my_location'+';;get the location'+s ;
    l7 = '7;use sms'+';;send the sms to the target'+s ;
    l8 = '8;use email'+';;send the eamil to the target'+s ;
    l9 = '9;get my_time'+';;get your time'+s ;
    l10 = '10;search /?'+';;get the help about search'+s ;
    l11 = '11;search ip'+';;search the ip of the target'+s ;
    l12 = '12;use search_harker:sogou'+';;use sogou harker to search things'+s ;
    l13 = '13;use search_harker:baidu'+';;use baidu harker to search things'+s ;
    l14 = '14;use search_harker:bing'+';;use bing harker to search'+s ;
    l15 = '15;shell -get'+';;show how to get the shell'+s ;
    l16 = '16;color -green'+';;change the color green'+s ;
    l17 = '17;color -white'+';;change the color white'+s ;
    l18 = '18;get my_ip'+';;get your ip adress'+s ;
    l19 = '19;git -gitee'+';;goto the gitee Warehouse'+s ;
    l20 = '20;git -github'+';;goto the github Warehouse'+s ;
    l21 = 'website -goto'+';;goto the target website'+s ;
    l22 = 'shell -vistion'+';;get the vistion info'+s ;
    l23 = 'shell -about'+';;get the information of the shell'+s ;
    l24 = 'use shodan_search'+';;use shodan command to search the IOT'+s ;
    l25 = 'clear'+';;clear all the command' ;
    /**
     * end the list
     */
    var list_command = [
        l1 , l2 ,l3 , l4 ,l5 ,l6 ,l7 ,
        l8 ,l9,l10,l11,l12,l13,l14,
        l15,l16,l17,l18,l19,
        l20,l21,l22,l23,l24,l25
    ] ;
    console.log(list_command) ;
    show_command(list_command) ;
}
window.onload=function()
{
    var input=document.getElementById("in") //get the dom from html
    input.onkeydown=function(ev)
    {
        var event=ev ||event ;
        if(event.keyCode == 13) //if the 'enter' key down than run 
        {
        console.log('[*]'+command)
        var command = document.getElementById('in').value;
        console.log('Command:' + command) //print the input things
        if (command == 'help'){
            get_help() ;
            return true ;
        }
        if (command == 'get my_language'){
            var lang = navigator.language ;
            console.log(lang) ;
            show_command(lang) ;
            return true
        }
        if (command == 'exit'){
            //qiut
            window.close() ;
            return true
        }
        if(command == 'get my_system'){
            get_my_system() ;
            return true
        }
        if (command == 'get my_sysinfo'){
            //get the users system and webbrowser info
            get_sysinfo() ;
            return true
        }
        if (command == 'get my_location'){
            //get the location
            get_location();
            return true
        } ;
        if (command == 'use sms'){
            send_sms() ;
            return true
        }
        if (command == 'use email'){
            send_email() ;
            return true
        }
        if (command == 'get my_time'){
            //get the time
            get_time() ;
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'search /?'){
            //show the help of the search list
            search_show() ;
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'search ip'){
            //search the ip
            //server from https://ip.cn
            search_ip() ;
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'use search_harker:sogou'){
            for (i = 1 ; i <= 1 ; i++){
                //sogou search 
                sogou_search() ;
                document.getElementById('in').value = '' ;
                return true
            }
        } ;
        if (command == 'use search_harker:baidu'){
            //use baidu harker
            show_command('search:https://www.baidu.com<br />Use Baidu Harker') ;
            baidu_harker() ;
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'use search_harker:bing')
	    //use search engnnering's command to search the information
        {
		    var content = ['search:https://www.bing.com<br />' , 'Use Bing Hacker'] ;
		    show_command(content) ;
            bing_harker() ;
            document.getElementById('in').value = '' ;
            return true
	    }
	    if (command == 'shell -get'){
            shell_get()
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'color -green'){
                //change the color green
                color_green()
                document.getElementById('in').value = '' ;
                return true
        }
        if (command == 'color -white')
        {
            //change the color white
            //use css method
            color_white()
            var content = ' [*]Change Color:White'
            show_command(content)
            document.getElementById('in').value = '' ;
            return true
        }if (command == 'get my_ip')
            {
            //get the ip adress
            var show = "<iframe scrolling='no' src='http://pv.sohu.com/cityjson?ie=utf-8' class='getip'></iframe>" ;
            show_command(show) ;
            document.getElementById('in').value = '' ;
            return true
        }
        if (command == 'git -gitee'){
            git_gitee()
            document.getElementById('in').value = '' ;
            return true
        }
            if (command == 'git -github')
            {
                git_github()
                document.getElementById('in').value = '' ;
                return true
            }
            if (command == 'website -goto'){
                //goto the web site
                var show = '[*]Goto The Website!'
                show_command(show)
                web_site_goto()
                document.getElementById('in').value = '' ;
                return true
            }
            if (command == 'shell -vistion')
            {
                //show the web shell 's vistion
                var content='[*]Web Shell<br/>Vistion:4.1.1<br />'
                show_command(content)
                document.getElementById('in').value = "";
                return true
            }
            if (command == 'shell -about')
            {
                about = 'Web Shell<br/>Auther:LinWinCloud<br/>'+
                "You can visit url:https://gitee.com/LinWin-Cloud/<br/>"
                +"A shell in web.<br />";
                show_command(about)
                //show about the web shell 's information
                document.getElementById('in').value = "";
                return true
            }
            if (command == 'use shodan_search')
            {
                //use shodan search engenner to search
                //server from https://www.shodan.io
                shodan_search()
            return true
            }
            if (command == '')
            {
                var li = 'WebShell:~$<br/>'
                show_command(li) ;
                return true
            }
            if (command == 'clear')
            {
                //clear the screen
                var clear = document.getElementById('command') ;
                clear.innerHTML = '' ;
                document.getElementById('in').value = '' ;
                return true
            }
            else
            {
                var show_error = "<p style='color:red'>[*]Do not find command ! Input:"+command+"</p>"
                show_command(show_error);
                document.getElementById('in').value = "";
                return false
                //none the command in the shell , do not run any function
            }
        }
    }   
}
