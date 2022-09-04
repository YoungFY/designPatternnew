package com.dp.Factory;

/**
 * @Title:
 * @Description:
 * @Author: guowl
 * @version： 1.0
 * @Date:2021/12/24
 * @Copyright: Copyright(c)2021 RedaFlight.com All Rights Reserved
 */
public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);
}
