package com.spring;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * @author yuan'yu
 * @title: SpringStart
 * @projectName spring
 * @description: TODO
 * @date 2021/4/616:41
 */
public class SpringStart {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();
        JSONObject result = new JSONObject();
        JSONArray data = new JSONArray();
        //第一行
        JSONObject first = new JSONObject();
        first.put("healthScore",93.1 );
        first.put("businessStatus","64/12/2");
        first.put("todayTotalBusiness",38281);
        first.put("healthRunningDays",15);
        result.put("firstLine", first);
        //业务健康
        //个人业务
        JSONObject personalBusiness = new JSONObject();
        personalBusiness.put("name","个人业务");
        personalBusiness.put("healthScore",90.2);
        JSONArray phealthRank = new JSONArray();
        Map<String,Double> pmap =new HashMap<>();
        pmap.put("业务3",92.8);
        pmap.put("业务4",92.6);
        pmap.put("业务5",92.1);
        pmap.put("业务1",94.1);
        pmap.put("业务2",93.2);

        List<Map.Entry<String,Double>> plstEntry=new ArrayList<>(pmap.entrySet());
        Collections.sort(plstEntry,((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        }));
        for (int i = 0; i <5 ; i++) {
           JSONObject inJson =new JSONObject();
            inJson.put(plstEntry.get(i).getKey(),plstEntry.get(i).getValue());
            phealthRank.add(inJson);

        }
        personalBusiness.put("healthRank",phealthRank);


        JSONArray personalCircle = new JSONArray();
        JSONArray personalLine = new JSONArray();
        JSONObject pcircle01 =  new JSONObject();
        JSONObject pcircle02 =  new JSONObject();
        JSONObject pcircle03 =  new JSONObject();
        pcircle01.put("name","较差");
        pcircle01.put("value","10");
        pcircle02.put("name","普通");
        pcircle02.put("value","20");
        pcircle03.put("name","健康");
        pcircle03.put("value","170");
        personalCircle.add(pcircle01);
        personalCircle.add(pcircle02);
        personalCircle.add(pcircle03);
        personalBusiness.put("circle",personalCircle);
        JSONObject pline01 =  new JSONObject();
        JSONObject pline02 =  new JSONObject();
        JSONObject pline03 =  new JSONObject();
        JSONObject pline04 =  new JSONObject();
        JSONObject pline05 =  new JSONObject();
        pline01.put("name","9-21");
        pline01.put("value","91");
        pline02.put("name","9-22");
        pline02.put("value","96");
        pline03.put("name","9-23");
        pline03.put("value","93");
        pline04.put("name","9-24");
        pline04.put("value","84");
        pline05.put("name","9-25");
        pline05.put("value","90");
        personalLine.add(pline01);
        personalLine.add(pline02);
        personalLine.add(pline03);
        personalLine.add(pline04);
        personalLine.add(pline05);
        personalBusiness.put("line",personalLine);
        result.put("personalBusiness",personalBusiness);
        //家庭业务
        JSONObject homeBusiness = new JSONObject();
        homeBusiness.put("name","家庭业务");
        homeBusiness.put("healthScore",94.3);
        JSONArray hhealthRank = new JSONArray();
        Map<String,Double> hmap =new HashMap<>();
        hmap.put("业务3",95.8);
        hmap.put("业务4",95.7);
        hmap.put("业务5",95.1);
        hmap.put("业务1",96.3);
        hmap.put("业务2",96.1);

        List<Map.Entry<String,Double>> hlstEntry=new ArrayList<>(hmap.entrySet());
        Collections.sort(hlstEntry,((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        }));
        for (int i = 0; i <5 ; i++) {
            JSONObject inJson =new JSONObject();
            inJson.put(hlstEntry.get(i).getKey(),hlstEntry.get(i).getValue());
            hhealthRank.add(inJson);

        }
        homeBusiness.put("healthRank",hhealthRank);


        JSONArray homeCircle = new JSONArray();
        JSONArray homeLine = new JSONArray();
        JSONObject hcircle01 =  new JSONObject();
        JSONObject hcircle02 =  new JSONObject();
        JSONObject hcircle03 =  new JSONObject();
        hcircle01.put("name","较差");
        hcircle01.put("value","16");
        hcircle02.put("name","普通");
        hcircle02.put("value","20");
        hcircle03.put("name","健康");
        hcircle03.put("value","164");
        homeCircle.add(hcircle01);
        homeCircle.add(hcircle02);
        homeCircle.add(hcircle03);
        homeBusiness.put("circle",homeCircle);
        JSONObject hline01 =  new JSONObject();
        JSONObject hline02 =  new JSONObject();
        JSONObject hline03 =  new JSONObject();
        JSONObject hline04 =  new JSONObject();
        JSONObject hline05 =  new JSONObject();
        hline01.put("name","9-21");
        hline01.put("value","91");
        hline02.put("name","9-22");
        hline02.put("value","96");
        hline03.put("name","9-23");
        hline03.put("value","93");
        hline04.put("name","9-24");
        hline04.put("value","80");
        hline05.put("name","9-25");
        hline05.put("value","90");
        homeLine.add(hline01);
        homeLine.add(hline02);
        homeLine.add(hline03);
        homeLine.add(hline04);
        homeLine.add(hline05);
        homeBusiness.put("line",homeLine);
        result.put("homeBusiness",homeBusiness);
        //集团业务
        JSONObject jtBusiness = new JSONObject();
        jtBusiness.put("name","集团业务");
        jtBusiness.put("healthScore",91.6);

        JSONArray jthealthRank = new JSONArray();
        Map<String,Double> jtmap =new HashMap<>();
        jtmap.put("业务3",92.6);
        jtmap.put("业务4",92.2);
        jtmap.put("业务5",91.8);
        jtmap.put("业务1",93.3);
        jtmap.put("业务2",93.1);

        List<Map.Entry<String,Double>> jtlstEntry=new ArrayList<>(jtmap.entrySet());
        Collections.sort(jtlstEntry,((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        }));
        for (int i = 0; i <5 ; i++) {
            JSONObject inJson =new JSONObject();
            inJson.put(jtlstEntry.get(i).getKey(),jtlstEntry.get(i).getValue());
            jthealthRank.add(inJson);

        }
        jtBusiness.put("healthRank",jthealthRank);


        JSONArray jtCircle = new JSONArray();
        JSONArray jtLine = new JSONArray();
        JSONObject jcircle01 =  new JSONObject();
        JSONObject jcircle02 =  new JSONObject();
        JSONObject jcircle03 =  new JSONObject();
        jcircle01.put("name","较差");
        jcircle01.put("value","15");
        jcircle02.put("name","普通");
        jcircle02.put("value","24");
        jcircle03.put("name","健康");
        jcircle03.put("value","161");
        jtCircle.add(jcircle01);
        jtCircle.add(jcircle02);
        jtCircle.add(jcircle03);
        jtBusiness.put("circle",jtCircle);
        JSONObject jline01 =  new JSONObject();
        JSONObject jline02 =  new JSONObject();
        JSONObject jline03 =  new JSONObject();
        JSONObject jline04 =  new JSONObject();
        JSONObject jline05 =  new JSONObject();
        jline01.put("name","9-21");
        jline01.put("value","92");
        jline02.put("name","9-22");
        jline02.put("value","81");
        jline03.put("name","9-23");
        jline03.put("value","85");
        jline04.put("name","9-24");
        jline04.put("value","80");
        jline05.put("name","9-25");
        jline05.put("value","88");
        jtLine.add(jline01);
        jtLine.add(jline02);
        jtLine.add(jline03);
        jtLine.add(jline04);
        jtLine.add(jline05);
        jtBusiness.put("line",jtLine);
        result.put("jtBusiness",jtBusiness);
        //新业务
        JSONObject newBusiness = new JSONObject();
        newBusiness.put("name","新业务");
        newBusiness.put("healthScore",87.8);
        JSONArray newhealthRank = new JSONArray();
        Map<String,Double> newmap =new HashMap<>();
        newmap.put("业务3",93.7);
        newmap.put("业务4",93.6);
        newmap.put("业务5",93.1);
        newmap.put("业务1",94.6);
        newmap.put("业务2",94.4);

        List<Map.Entry<String,Double>> newlstEntry=new ArrayList<>(newmap.entrySet());
        Collections.sort(newlstEntry,((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue());
        }));
        for (int i = 0; i <5 ; i++) {
            JSONObject inJson =new JSONObject();
            inJson.put(newlstEntry.get(i).getKey(),newlstEntry.get(i).getValue());
            newhealthRank.add(inJson);

        }
        newBusiness.put("healthRank",newhealthRank);


        JSONArray newCircle = new JSONArray();
        JSONArray newLine = new JSONArray();
        JSONObject ncircle01 =  new JSONObject();
        JSONObject ncircle02 =  new JSONObject();
        JSONObject ncircle03 =  new JSONObject();
        ncircle01.put("name","较差");
        ncircle01.put("value","17");
        ncircle02.put("name","普通");
        ncircle02.put("value","26");
        ncircle03.put("name","健康");
        ncircle03.put("value","157");
        newCircle.add(ncircle01);
        newCircle.add(ncircle02);
        newCircle.add(ncircle03);
        newBusiness.put("circle",newCircle);
        JSONObject nline01 =  new JSONObject();
        JSONObject nline02 =  new JSONObject();
        JSONObject nline03 =  new JSONObject();
        JSONObject nline04 =  new JSONObject();
        JSONObject nline05 =  new JSONObject();
        nline01.put("name","9-21");
        nline01.put("value","78");
        nline02.put("name","9-22");
        nline02.put("value","85");
        nline03.put("name","9-23");
        nline03.put("value","88");
        nline04.put("name","9-24");
        nline04.put("value","83");
        nline05.put("name","9-25");
        nline05.put("value","90");
        newLine.add(nline01);
        newLine.add(nline02);
        newLine.add(nline03);
        newLine.add(nline04);
        newLine.add(nline05);
        newBusiness.put("line",newLine);
        result.put("newBusiness",newBusiness);
      //系统健康度
      JSONObject systemHealth = new JSONObject();
      JSONArray systemhealthRank = new JSONArray();
      Map<String,Double> systemMap =new HashMap<>();
      systemMap.put("BOMC系统",93.7);
      systemMap.put("BOSS系统",93.6);
      systemMap.put("容灾系统",93.1);
      systemMap.put("PASS系统",94.6);
      systemMap.put("CRM系统",94.4);

      List<Map.Entry<String,Double>> syslstEntry=new ArrayList<>(systemMap.entrySet());
      Collections.sort(syslstEntry,((o1, o2) -> {
        return o2.getValue().compareTo(o1.getValue());
      }));
      for (int i = 0; i <5 ; i++) {
        JSONObject inJson =new JSONObject();
        inJson.put(syslstEntry.get(i).getKey(),syslstEntry.get(i).getValue());
        systemhealthRank.add(inJson);

      }
      systemHealth.put("systemHealthRank",systemhealthRank);
      JSONArray systemLine = new JSONArray();
      JSONObject sline01= new JSONObject();
      JSONObject sline02= new JSONObject();
      JSONObject sline03= new JSONObject();
      JSONObject sline04= new JSONObject();
      JSONObject sline05= new JSONObject();
      sline01.put("name","9-21");
      sline01.put("value",89.6);
      sline02.put("name","9-22");
      sline02.put("value",94.2);
      sline03.put("name","9-23");
      sline03.put("value",86.2);
      sline04.put("name","9-24");
      sline04.put("value",82.2);
      sline05.put("name","9-25");
      sline05.put("value",90.2);
      systemLine.add(sline01);
      systemLine.add(sline02);
      systemLine.add(sline03);
      systemLine.add(sline04);
      systemLine.add(sline05);
      systemHealth.put("systemLine",systemLine);
      //System.out.println(systemHealth);
      result.put("systemHealth", systemHealth);

        String s = result.toString();

      System.out.println(result);

    }
}
