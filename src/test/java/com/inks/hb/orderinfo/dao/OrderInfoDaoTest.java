package com.inks.hb.orderinfo.dao;

import com.inks.hb.login.dao.LoginDao;
import com.inks.hb.login.pojo.Login;
import com.inks.hb.orderinfo.pojo.OrderInfo;
import com.inks.hb.roomtype.dao.RoomTypeDao;
import com.inks.hb.roomtype.pojo.RoomType;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderInfoDaoTest {

    OrderInfoDao dao = new OrderInfoDao();
    RoomTypeDao roomTypeDao = new RoomTypeDao();
    LoginDao loginDao = new LoginDao();

    @Test
    public void insertData() throws Exception {

        OrderInfo orderInfo = new OrderInfo();
        RoomType roomType = roomTypeDao.queryName("123");
        Login login = (Login) loginDao.query(new Login("root",""));
        System.out.println(login);
        orderInfo.setTypeId(roomType);
        orderInfo.setOperatorId(login);
        orderInfo.setOrderId("预定第3单");
        dao.insertData(orderInfo);

    }

}