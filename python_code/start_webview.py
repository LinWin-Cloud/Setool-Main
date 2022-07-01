import os

def main():
    withopen = open("./port_config/webview" , "r")
    port = withopen.read()
    os.system("cd Web_View && python3 -m http.server "+str(port))
    with open("./port_config/webview_1" , "w") as f:
        f.write("http://127.0.0.1:"+str(port))
main()