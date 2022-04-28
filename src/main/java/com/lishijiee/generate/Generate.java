//package com.lishijiee.generate;
//
//import com.alibaba.druid.DbType;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.Scanner;
//
//public class Generate {
//    public static void main(String[] args) {
//
//        // 创建generate对象
//        AutoGenerator autoGenerator = new AutoGenerator();
//
//        // 数据源
//        DataSourceConfig dataSourceConfig = new DataSourceConfig();
//        dataSourceConfig.setDbType(DbType.MYSQL);
//        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8");
//        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
//        dataSourceConfig.setUsername("root");
//        dataSourceConfig.setPassword("");
//        autoGenerator.setDataSource(dataSourceConfig);
//
//        // 全局配置
//        GlobalConfig globalConfig = new GlobalConfig();
//        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
//        globalConfig.setOpen(false);
//        globalConfig.setAuthor("彭_德华");
//        globalConfig.setServiceName("%sService"); // 去掉service的前缀
//        autoGenerator.setGlobalConfig(globalConfig);
//
//        // 包信息
//        PackageConfig packageConfig = new PackageConfig();
//        packageConfig.setParent("com.pdh");
//        packageConfig.setController("controller");
//        packageConfig.setService("service");
//        packageConfig.setServiceImpl("service.impl");
//        packageConfig.setMapper("dao.mapper");
//        packageConfig.setXml("dao.mapper.xml");
//        packageConfig.setEntity("entity");
//        autoGenerator.setPackageInfo(packageConfig);
//
//        // 配置策略
//        StrategyConfig strategyConfig = new StrategyConfig();
//        strategyConfig.setTablePrefix("mp_");
//        strategyConfig.setInclude(scanner("表名，多个英文逗号分割").split(","));
//        strategyConfig.setEntityLombokModel(true);
//        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
//        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel); // 下划线转驼峰
//        autoGenerator.setStrategy(strategyConfig);
//
//        // 执行
//        autoGenerator.execute();
//    }
//
//    /**
//     * 接收用户输入的方法
//     * @param str
//     * @return
//     */
//    private static String scanner(String str){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入"+str+":");
//        if(sc.hasNext()){
//            String tableNames = sc.next();
//            if(StringUtils.isNotBlank(tableNames)){
//                return tableNames;
//            }
//        }
//        throw new MybatisPlusException("请输入正确的" + str + "!");
//    }
//}
//
