package com.dp.BuilderPattern;


/**
 * @Title:
 * @Description:
 * @Author: guowl
 * @version： 1.0
 * @Date:2021/12/27
 * @Copyright: Copyright(c)2021 RedaFlight.com All Rights Reserved
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder  houseBuilder=new CommonHouseBuilder();
        HouseDirector houseDirector=new HouseDirector(houseBuilder);
        House house = houseDirector.constructHouse();
    }
}
