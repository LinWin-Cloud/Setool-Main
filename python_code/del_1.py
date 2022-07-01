import os

def main():
    os.system("rm -fr ./log_server/*")
    os.system("mkdir ./log_server/auxiliary")
    os.system("mkdir ./log_server/http_server")
    os.system("mkdir ./log_server/Setool_RUN")
    os.system("mkdir ./log_server/function_using")
    os.system("mkdir ./log_server/email_attack")

main()