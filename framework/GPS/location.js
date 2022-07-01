
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
            },
            //on error
            function(error) {
                var errorType = ['你拒绝提供位置信息', '位置信息不可用', '获取信息超时'];
                alert(errorType[error.code - 1]);
            }
        );
    } ;
}