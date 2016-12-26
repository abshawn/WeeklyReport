# weeklyreport

## 一、实验简介
###一个多人在线协作的文档编辑器，例如可以用于工作中小团队或者小组内进行实时编写和收集周报。
用到的库（框架）主要有：
+	ckeditor （在线的编辑器） 
+	localStorage （HTML 5 Web 存储）
+	springmvc (轻量级Web框架)
+	spring jdbcTemplate
+	mysql数据库
本节实验完成的效果图如下，供参考：
 ![效果图](https://github.com/abshawn/weeklyreport/blob/master/1.png)
 
###完成的功能：
1.	在线协作编辑	
    嵌入浏览器网页的在线编辑器，支持多人协作编辑，刷新后读取后台最新编辑保存的内容	很重要	前台
2.	实时自动保存
   	通过在线编辑器，输入的内容，能够实时自动保存到客户端；刷新后数据不丢失；点击提交能够保存到数据库中	很重要	后台

###Github源码下载：
https://github.com/abshawn/WeeklyReport.git 
