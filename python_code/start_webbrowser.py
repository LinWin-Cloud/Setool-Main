
import webbrowser

def start_webbrowser():
    openfile = open("URL_cfg.txt")
    readfile = openfile.read()
    print("URL:"+readfile)
    webbrowser.open(readfile)

start_webbrowser()