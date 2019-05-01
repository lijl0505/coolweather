package com.coolweather.android.db;

import org.litepal.crud.DataSupport;


/*
 * 存放省数据的实体类
 */
public class Province extends DataSupport {

    //唯一标识
    private int id;
    //记录省的名字
    private String provinceName;
    //记录省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
