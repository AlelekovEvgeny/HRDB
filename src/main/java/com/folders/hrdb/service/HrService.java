package com.folders.hrdb.service;

import com.folders.hrdb.dao.HrDAO;
import com.folders.hrdb.entity.Hr;

public class HrService {

    private HrDAO hrDao = new HrDAO();

    public void saveHr(Hr hr) {
        hrDao.save(hr);
    }
}