package com.folders.hrdb.service;

import com.folders.hrdb.DAO.HrDAO;
import com.folders.hrdb.entity.Hr;

import java.util.ArrayList;
import java.util.List;

public class HrService {
    public void creatHrData(String[] arrayHrData) {
        Hr hr = new Hr();
        HrDAO hrDAO = new HrDAO();
        List<Hr> hrDataList = new ArrayList<>();
        for (int i=0; i<arrayHrData.length; i++) {
            hr.setSurname(arrayHrData[0]);
            hr.setFirstname(arrayHrData[1]);
            hr.setCompany(arrayHrData[2]);
            hr.setTelefon(arrayHrData[3]);
        }
        hrDataList.add(hr);
        String s = hrDataList.toString().replace("[","").replace("]","");
        hrDAO.hrDataInsert(s);
    }
}
