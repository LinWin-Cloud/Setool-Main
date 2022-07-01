from nis import cat
import qrcode

a = open("./QRconfig.txt")
b = a.read()
Optionsconfig = open("./config/pyQR")
Options = Optionsconfig.read()
writeop = int(Options) + 1
with open ("./config/pyQR", "w") as f:
    f.write(str(writeop))
img = qrcode.make(b)
img.save('./QRcode/attack'+str(writeop)+'.png')
print("Save QRcode as attack"+str(writeop)+".png")