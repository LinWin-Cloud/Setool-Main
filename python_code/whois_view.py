import whois as whois

openfile = open("whois.txt")
readfile = openfile.read()
print(readfile)
get_whois = whois.whois(readfile)
print(get_whois)
with open("whois_result.txt", "w") as f:
    f.write(str(get_whois))