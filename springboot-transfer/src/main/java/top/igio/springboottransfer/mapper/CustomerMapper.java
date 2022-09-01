package top.igio.springboottransfer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.igio.springboottransfer.entity.Customer;

import java.util.List;

/**
* @author 29314
* @description 针对表【customer(客户信息表)】的数据库操作Mapper
* @createDate 2022-08-07 18:42:36
*/
@Mapper
public interface CustomerMapper  {

    Customer findById(@Param("customerId") Long customerId);

    Customer getCustomerAndAccount(@Param("customerId") Long customerId);
    List<Customer> getCustomerList();

    void insertAll(Customer customer);

    void deleteById(@Param("customerId") Long customerId);

    void updateById(Customer customer);

}




