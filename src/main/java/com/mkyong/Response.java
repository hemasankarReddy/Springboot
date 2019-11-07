package com.mkyong;

import com.mkyong.model.Employee;

import java.util.List;
import java.util.Map;

public class Response {
   private  List<Map<String,String>>  columnsList;
    private List<Employee> dataList;

    public String getTableID() {
        return tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    private String tableID;

    public List<Map<String, String>> getColumnsList() {
        return columnsList;
    }

    public void setColumnsList(List<Map<String, String>> columnsList) {
        this.columnsList = columnsList;
    }

    public List<Employee> getDataList() {
        return dataList;
    }

    public void setDataList(List<Employee> dataList) {
        this.dataList = dataList;
    }
}
