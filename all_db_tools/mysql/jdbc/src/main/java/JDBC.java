import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Mr.Yang
 * @desc JDBC
 * @date 2022/9/5 11:39
 */
public class JDBC {

    public static void main(String[] args) {

    }

//    public static void jdbcInsert(List<AreaPlatform> areaPlatform){
//        try {
//            //1.加载驱动程序
//            Class.forName("com.mysql.jdbc.Driver");
//            //2. 获得数据库连接
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://test-eic-15.db.58dns.org:53384/db58_td_db_offline?characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull",
//                    "tddboffline_test", "288df1076d3cc043");
//
//            //3.操作数据库，实现增删改查
//            //Statement stmt = conn.createStatement();
//            final PreparedStatement preparedStatement = conn.prepareStatement("" +
//                    "insert into area_platform(" +
//                    "code," +
//                    "name," +
//                    "parent_code," +
//                    "level," +
//                    "platform_id," +
//                    "target_code," +
//                    "status" +
//                    ") values (?,?,?,?,?,?,?)");
//
//            areaPlatform.stream().forEach(t->{
//                try {
//                    preparedStatement.setObject(1,t.getCode());
//                    preparedStatement.setObject(2,t.getName());
//                    preparedStatement.setObject(3,t.getParentCode());
//                    preparedStatement.setObject(4,t.getLevel());
//                    preparedStatement.setObject(5,t.getPlatformId());
//                    preparedStatement.setObject(6,t.getTargetCode());
//                    preparedStatement.setObject(7,t.getStatus());
//                    preparedStatement.addBatch();
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//            });
//
//            preparedStatement.executeBatch();
//
//            //preparedStatement.executeUpdate()
//
//
////            ResultSet rs = stmt.executeQuery("SELECT id, code, name, parent_code, `level`, platform_id, target_code, sort, status, create_time, update_time, create_user, update_user\n" +
////                    "FROM db58_td_db_offline.area_platform\n" +
////                    "where platform_id =7 and `level` = 2 ");
////            //如果有数据，rs.next()返回true
////            while (rs.next()) {
////                System.out.println(rs.getString("id"));
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }


}
