package top.igio.springboottransfer.controller;

import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import top.igio.springboottransfer.entity.Record;
import top.igio.springboottransfer.mapper.RecordMapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author igio
 * @date 2022/8/23
 * @apiNote
 */
public class test {
    @Autowired
    private RecordMapper recordMapper;

    public void test1() {
        Date date = DateUtil.date();
        String format = DateUtil.format(date, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        List<Record> records = recordMapper.selectByTime(format);

        for(Record record : records) {
            System.out.println(record);
        }
    }

    public static void main(String[] args) {
        test test1 = new test();
        test1.test1();
    }
}
