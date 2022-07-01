from nis import cat
from warnings import catch_warnings
import requests
import os

def main():
    try:
        #download
        file = requests.get("https://gitee.com/LinWin-Cloud/packages.LinWinCloud.gitee/raw/master/SetoolMain.packages/version_info.zip")
        #write 
        with open("./tmp/version_info.zip", "wb") as f:
            f.write(file.content)
        #unzip
        os.system("unzip ./tmp/version_info.zip -d ./tmp/")
        #read
        readfile = open("./tmp/version_info.txt", "r")
        version = readfile.read()
        print(version)
        #write version to file
        with open("./tmp/version.txt", "w") as f:
            f.write(version)
    except:
        print("[!]Get version error")
        


main()