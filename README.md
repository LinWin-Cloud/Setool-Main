# Setool-Main
(入门不当可能导致入狱) 适用于linux的企业级别社会工程学渗透测试、轻量级别Web渗透辅助
<br />。内置的钓鱼网站可以获取主要的个人信息账户；网站克隆模块可以把白宫网站给克隆下
<br />来；内置的各种Web终端完全可以群体性的攻击和对社会工程学的测试；破坏性脚本和半自
<br />
<br />动编写勒索信完美辅助了社工等等。使用Java开发，参考了大大小小的企业级别社会工程
<br />学案例，定制出的一款适用于企业级别的社工测试和攻击的高级命令行工具。
## 手动安装Setool Main
##### git clone https://github.com/LinWin-Cloud/Setool-Main
##### sudo mkdir /opt/Setool-Main
##### sudo chmod 777 /opt/Setool-Main
##### mv Setool-Main/* /opt/Setool-Main
##### sudo echo > /bin/setoolmain
### 编写下列脚本到 /bin/setoolmain
###### cd /opt/Setool-Main
###### javac setool.java
###### java setool
### 然后每次只需要在终端内输入下列命令便可激活使用
###### setoolmain

# 依赖项目
1. python3 
2. java18
3. ssh
4. unzip
5. git
6. pip3
7. python-whois
8. python-QRcode
9. python-requests

### 安装依赖项
1. sudo su
2. apt install python3
3. apt install openjdk-18-jdk
4. apt install openssh-client
5. apt install unzip
6. apt install git
7. apt install python3-pip
8. pip3 install python-whois
9. pip3 install qrcode
10. pip3 install requests

# 使用教程
打开Linux命令行终端 bash 或者 Linux powershell

注意：不能够使用root运行，如果使用root运行程序会自动给报错
1. git clone https://github.com/LinWin-Cloud/Setool-Main
2. cd Setool-Main
3. javac setool.java
4. java setool 然后便可以使用
输入help获取命令行帮助

# 更新日志
1. v1.0.1 2022.1.5 发布Setool Linux
2. v2.0.1 2022.3.5 发布Setool Master
3. v3.0.1 2022.7.1 发布Setool Main
4. v3.0.2 2022.7.2 更新配置文件、更新版本信息
5. v3.0.3 2022.7.3 更新配置文件
6. v3.0.4 2022.7.4 修复配置错误
7. v3.0.5 2022.7.5 更新项目
8. v3.0.6 2022.7.5 更新安装文档、脚本
9. v3.0.7 2022.7.6 更新配置文件，修复安装脚本
10. v3.0.8 2022.7.6 修复http服务安全漏洞
11. v3.0.9 2022.7.7 更新源代码
12. v3.1.0 2022.7.8 更新源代码、配置文件
13. v3.1.1 2022.7.10 更新源代码、修复IO操作漏洞
14. v3.1.2 2022.7.13 更新配置文件
15. v3.1.3 2022.7.14 更新配置文件、源代码
16. v3.1.4 2022.7.16 更新源代码、配置文件
17. v3.1.5 2022.7.16 项目正式更名为Setool Main LTS长期支持版本
