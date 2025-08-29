<h3>8.29更新内容：</h3>
MyService.java中的enc和uuid发送变化，请自行修改

在 https://github.com/sh1SuTa/xueXiT/blob/ea3ebf0cfcf7fb6cefd0354144e86cf5f0555826/src/main/java/com/putileaf/xuexit/MyService.java
中填写你的Cookie
![img1.png](img1.png)
此外，你需要抓取加密的表单数据提交

如何获取Cookie，https://i.chaoxing.com/
打开浏览器F12登录即可
![img_1.png](img_1.png)

如何打包？
使用idea打开maven项目
![img_2.png](img_2.png)
package为jar包，在target目录下
![img_3.png](img_3.png)
然后部署到你的电脑或者服务器上都行，最好是24小时不间断的运行，

如何修改定时？
在 https://github.com/sh1SuTa/xueXiT/blob/master/src/main/java/com/putileaf/xuexit/service/TimeService.java 
中
![img_4.png](img_4.png)
<br>
 0  50   9    *   *       ？   
 秒  分   时  每天 每月 不指定具体的星期几
<br>

克隆仓库
git clone https://github.com/sh1SuTa/xueXiT.git



值得一提的是：
![img_5.png](img_5.png)
武软的fid是31027，而武汉晴川学院的是39037
其他学校不知道，欢迎补充
