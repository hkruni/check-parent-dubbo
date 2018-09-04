package com.cmdi.check.dao;

import com.cmdi.check.model.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hukai on 2018/9/4.
 */
public interface GoodDAO {

    public List<Good> getGood();


    public int addGood(Good good);
}
