import com.alibaba.excel.EasyExcel;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author yuanyu
 * @title: Test
 * @description: TODO
 * @date 2021/9/14 10:17
 */

public class MyTest {
    String path="D:\\mythreadtest\\";
    //封装待写入的数据
    public List<CsvData> data(){
        List<CsvData> csvDataList = new ArrayList<CsvData>();
        for (int i = 0; i < 10000; i++) {
            String id = String.valueOf(i);
            String name = "姓名"+i;
            String birth = new Date().toString();
            CsvData csvData = new CsvData(id,name,birth);
            csvDataList.add(csvData);
        }
        return csvDataList;

    }
    @Test
    public void whriteFile(){
        String fileName = path+"EasyExcel.xlsx";

        EasyExcel.write(fileName, CsvData.class).sheet("模板").doWrite(data());
    }
    public void readFile(){

    }
}
