package top.igio.springboottransfer.mapper;


import cn.hutool.core.date.DateTime;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.igio.springboottransfer.entity.Record;

import java.util.Date;
import java.util.List;

/**
* @author 29314
* @description 针对表【record(交易信息表)】的数据库操作Mapper
* @createDate 2022-08-07 18:42:40
*/
@Mapper
public interface RecordMapper {

    Record selectById(@Param("recordId") Long recordId);

    List<Record> selectByTime(@Param("appointmentTime") String appointmentTime);

    void insertAll(Record record);

    void updateTransferState(Record record);

}




