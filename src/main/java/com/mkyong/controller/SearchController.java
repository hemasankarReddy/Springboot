package com.mkyong.controller;

import com.mkyong.Response;
import com.mkyong.model.AjaxResponseBody;
import com.mkyong.model.Employee;
import com.mkyong.model.SearchCriteria;
import com.mkyong.model.User;
import com.mkyong.services.EmployeeService;
import com.mkyong.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class SearchController {

    UserService userService;

    @Autowired
    EmployeeService employeeService;
int count=0;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/api/search")
    public Response getSearchResultViaAjax(@Valid @RequestBody SearchCriteria search, Errors errors) {
        count++;
        Response response = new Response();
        response.setTableID(count+"");
        if(count % 2 == 0) {
            response.setColumnsList(getColumns());
            response.setDataList(employeeService.getAllEmployees());
        }
        else{
            response.setColumnsList(getColumns1());
            response.setDataList(employeeService.getAllEmployees());
        }
        return response;
    }

    private List<Map<String,String>> getColumns(){
        String column[]={"id","name","lastName" ,"email", "phone" , "active","middleName","firstName","emial1" };
        List<Map<String,String>> dataList=new ArrayList<>();
        for(String col:column)
        {
            Map<String,String> colmap = new HashMap<>();
            colmap.put("data",col);
            colmap.put("title",col.toUpperCase());
            dataList.add(colmap);
        }
        return dataList;
    }
    private List<Map<String,String>> getColumns1(){
        String column[]={"id","name","lastName" };
        List<Map<String,String>> dataList=new ArrayList<>();
        for(String col:column)
        {
            Map<String,String> colmap = new HashMap<>();
            colmap.put("data",col);
            colmap.put("title",col.toUpperCase());
            dataList.add(colmap);
        }
        return dataList;
    }
}
