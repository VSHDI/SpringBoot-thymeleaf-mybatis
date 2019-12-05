package com.vshdi.hello.spring.boot.mybatis.entity;

import javax.persistence.*;

@Table(name = "city")
public class City {
    /**
     * 区域主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域上级标识
     */
    private Integer pid;

    /**
     * 地名简称
     */
    private String sname;

    /**
     * 区域等级
     */
    private Integer level;

    /**
     * 区域编码
     */
    private String citycode;

    /**
     * 邮政编码
     */
    private String yzcode;

    /**
     * 组合名称
     */
    private String mername;

    @Column(name = "Lng")
    private Float lng;

    @Column(name = "Lat")
    private Float lat;

    private String pinyin;

    /**
     * 获取区域主键
     *
     * @return id - 区域主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置区域主键
     *
     * @param id 区域主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区域名称
     *
     * @return name - 区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名称
     *
     * @param name 区域名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取区域上级标识
     *
     * @return pid - 区域上级标识
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置区域上级标识
     *
     * @param pid 区域上级标识
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取地名简称
     *
     * @return sname - 地名简称
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置地名简称
     *
     * @param sname 地名简称
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取区域等级
     *
     * @return level - 区域等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置区域等级
     *
     * @param level 区域等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取区域编码
     *
     * @return citycode - 区域编码
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 设置区域编码
     *
     * @param citycode 区域编码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 获取邮政编码
     *
     * @return yzcode - 邮政编码
     */
    public String getYzcode() {
        return yzcode;
    }

    /**
     * 设置邮政编码
     *
     * @param yzcode 邮政编码
     */
    public void setYzcode(String yzcode) {
        this.yzcode = yzcode;
    }

    /**
     * 获取组合名称
     *
     * @return mername - 组合名称
     */
    public String getMername() {
        return mername;
    }

    /**
     * 设置组合名称
     *
     * @param mername 组合名称
     */
    public void setMername(String mername) {
        this.mername = mername;
    }

    /**
     * @return Lng
     */
    public Float getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(Float lng) {
        this.lng = lng;
    }

    /**
     * @return Lat
     */
    public Float getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(Float lat) {
        this.lat = lat;
    }

    /**
     * @return pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * @param pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}