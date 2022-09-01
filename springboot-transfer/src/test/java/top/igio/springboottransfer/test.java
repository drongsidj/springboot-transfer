package top.igio.springboottransfer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.igio.springboottransfer.entity.Record;
import top.igio.springboottransfer.mapper.AccountMapper;
import top.igio.springboottransfer.mapper.RecordMapper;

import java.util.Date;

/**
 * @author igio
 * @date 2022/8/24
 * @apiNote
 */
public class test {

    @Autowired
    private RecordMapper recordMapper;

    @Test
    public void testDate(){
        System.out.println(System.getProperty("record.timezone"));
        Record record = new Record();
        // 省略其他字段
        record.setCreateTime(new Date());
        recordMapper.selectById(record.getRecordId());
    }
}
