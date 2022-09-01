package top.igio.springboottransfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.igio.springboottransfer.mapper")
public class SpringbootTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTransferApplication.class, args);
    }

}
