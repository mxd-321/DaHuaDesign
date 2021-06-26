package com.xawl.mxd.AbstractFactory;

import com.xawl.mxd.AbstractFactory.entity.User;
import com.xawl.mxd.AbstractFactory.factory.MysqlFactory;
import com.xawl.mxd.AbstractFactory.factory.SqlFactory;
import com.xawl.mxd.AbstractFactory.operation.IUser;

/**
 * @Author mxd
 * @Date 2021/6/24 20:48
 *  客户端不用知道是和哪个数据库打交道，只需要创建相应 user操作对象即可。
 *  如果现在要添加一个操作 Login 表，记录每个用户的登录日志，
 *   此时就要添加操作 Login表的 ILogin接口、MysqlLogin类、OracleLogin类
 *       并且要修改接口 SqlFactory接口已经它的所有实现类。
 *
 *  抽象工厂与工厂方法模式的区别在于：抽象工厂可以生产某个系列的多个产品，而工厂方法只可以生产一个产品
 *
 *  优缺点：
 *  优点：
 *   1、抽象工厂模式最大的好处是易于交换产品系列，由于具体工厂类，例如 IFactory factory=new OracleFactory();
 *      在一个应用中只需要在初始化的时候出现一次，这就使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。
 *   2、抽象工厂模式的另一个好处就是它让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操作实例，
 *      产品实现类的具体类名也被具体的工厂实现类分离，不会出现在客户端代码中。
 *  缺点：
 *   1. 如果你的需求来自增加功能，比如增加Login表，就有点太烦了。首先需要增加 ILogin，mysqlLogin,oracleLogin。
 *      然后我们还要去修改工厂类： sqlFactory， mysqlFactory， oracleFactory 才可以实现，需要修改三个类，实在是有点麻烦。
 *
 *   2. 还有就是，客户端程序肯定不止一个，每次都需要声明sqlFactory factory=new MysqlFactory()，
 *      如果有100个调用数据库的类，就需要修改100次sqlFactory factory=new oracleFactory()。
 */

public class Test {
    public static void main(String[] args) {
        SqlFactory mysqlFactory = new MysqlFactory();
        IUser userOperation = mysqlFactory.createUser();
        userOperation.getUser(1);
        userOperation.insert(new User());

    }
}
