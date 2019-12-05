package com.vshdi.hello.spring.boot.mybatis.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vshdi.hello.spring.boot.mybatis.HelloSpringBootMybatisApplication;
import com.vshdi.hello.spring.boot.mybatis.entity.City;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootMybatisApplication.class)
@Transactional
@Rollback
class CityMapperTest {

    @Autowired
    private CityMapper cityMapper;

    /**
     * 测试分页查询
     *
     */
    @Test
    public void testPage() {
        /*页码-笔数*/
        PageHelper.startPage(0,2);
        /**/
        Example example = new Example(City.class);
        PageInfo<City> pageInfo = new PageInfo<>(cityMapper.selectByExample(example));

        /*结果*/
        List<City> cities = pageInfo.getList();
        for (City city :cities) {
            System.out.println(city.getName());
        }
    }

}