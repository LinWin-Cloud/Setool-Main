import requests 
import os

def main():
    url = input("Setool-Main//Python_Payload//Website_Clone//Write The URL:")
    geturl = requests.get(url)
    geturl.encoding = "utf-8"
    print(geturl.text)
    os.system("rm -f ./clone.html")
    os.system("rm -f ../clone.html")
    with open("clone.html" , "w") as f:
        f.write(geturl.text)
    os.system("cp clone.html ../")
    os.system("python3 -m http.server 8080")

main()