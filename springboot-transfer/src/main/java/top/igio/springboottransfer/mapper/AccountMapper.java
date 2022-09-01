package top.igio.springboottransfer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.igio.springboottransfer.entity.Account;

import java.util.List;

/**
* @author 29314
* @description 针对表【account(账户信息表)】的数据库操作Mapper
* @createDate 2022-08-07 18:42:31
*/
@Mapper
public interface AccountMapper  {

    Account getByAccountId(@Param("accountId") Long accountId);

    void insertAll(Account account);

    void delByAccountId(@Param("accountId") Long accountId);

    void updateAccountId(Account account);

}




