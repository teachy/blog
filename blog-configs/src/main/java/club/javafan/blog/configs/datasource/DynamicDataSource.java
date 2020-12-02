package club.javafan.blog.configs.datasource;


import club.javafan.blog.common.util.DataSourceContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author 币圈豆子哥
 * @date 2019/12/8 9:48
 * @desc 获取当前数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.get();
    }
}
