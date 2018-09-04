package com.cmdi.check.serviceImpl;

import com.cmdi.check.dao.GoodDAO;
import com.cmdi.check.model.Good;
import com.cmdi.check.service.api.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hukai on 2018/9/4.
 */
public class GoodServiceImpl implements IGoodService{

    @Autowired
    private GoodDAO goodDAO;

    public Good add(String name, int password) {
        Good good = new Good();
        good.setName(name);
        good.setType(password);
        goodDAO.addGood(good);
        return good;
    }
}
