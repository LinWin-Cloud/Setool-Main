import os

def port_start():
    #use os command model to start the http port
    try:
        os.system("python3 -m http.server 8080")
        return True
    except:
        print("[!]Err:Do not start the port")
        return False

port_start()