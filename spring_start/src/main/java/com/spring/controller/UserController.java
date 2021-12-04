package com.spring.controller;

import com.spring.UserService;
import com.spring.impl.UserServiceImpl;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author yuan'yu
 * @title: UserController
 * @projectName spring
 * @description: TODO
 * @date 2021/4/621:20
 */
public class UserController {
    public static void main(String[] args) {
        //没有从容器中获取UserService 没有通过set依赖注入 所以没有UserDao对象就会报空指针
//        UserService userService=new UserServiceImpl();
//        userService.save();
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService = (UserService) app.getBean("userService");
       userService.save();
        readProperty();
        createXml();


    }
    //循环获取所有值
    private static void readProperty() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("domain");
        //遍历取值
        Enumeration enumeration = resourceBundle.getKeys();
        while (enumeration.hasMoreElements()) {
                String value = resourceBundle.getString((String) enumeration.nextElement());
                System.out.println(value);

        }

        }
        private static void createXml(){
            Document doc = DocumentHelper.createDocument();
            Element workflow=doc.addElement("workflow");
            Element head = workflow.addElement("head");
            Element filetype = head.addElement("filetype");
            filetype.addText("reqAddassets");
            Element createtime = head.addElement("createtime");
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = df.format(new Date());
            createtime.addText(time);
            Element platform_mark = head.addElement("platform_mark");
            platform_mark.addText("BOMC");
            String text=doc.asXML();
            System.out.println(text);

        }

}
