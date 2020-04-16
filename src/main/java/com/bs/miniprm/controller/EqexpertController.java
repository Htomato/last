package com.bs.miniprm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bs.miniprm.pojo.Contacts;
import com.bs.miniprm.pojo.Eqexpert;
import com.bs.miniprm.service.impl.EqexpertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @author 李宇超
 * @date 2020年3月25日
 */
@RestController
@RequestMapping("eqExpert")
public class EqexpertController {

    @Autowired
    private EqexpertServiceImpl eqexpertServiceImpl;


    @RequestMapping("allEqExpert")
    public Object all(){
        List<Eqexpert> eqexperts = eqexpertServiceImpl.queryAllEqExpert();
        return eqexperts;
    }

    /**
     *
     * @return 今年审核状态为0的装备专家
     */
    @RequestMapping("review")
    public Object review(){
        List<Eqexpert> eqexperts = eqexpertServiceImpl.queryUnReview();
        return eqexperts;
    }

    /**
     *
     * @param id
     * @return 返回修改状态
     */
    @RequestMapping("changeStatus")
    public int changeStatus(int id) {
        Eqexpert eqexpert = eqexpertServiceImpl.selectById(id);
        System.out.println("eqexpert = " + eqexpert);
        eqexpert.setEqexpertLast(1);
        int update = eqexpertServiceImpl.update(eqexpert);
        System.out.println("update = " + update);
        return update;
    }

    @RequestMapping("upload")
    public String upload(HttpServletRequest request, @RequestParam("description") String description,
                         @RequestParam("eqexpertQuaimage") MultipartFile file) throws Exception {
        System.out.println("执行upload");
        request.setCharacterEncoding("UTF-8");
        System.out.println("执行图片上传");

        System.out.println("description = " + description);
        if(!file.isEmpty()) {
            System.out.println("成功获取照片");
            String fileName = file.getOriginalFilename();
            String type = null;
//            获取图片的格式
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            System.out.println("图片初始名称为：" + fileName + " 类型为：" + type);
            if (type != null) {
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    //String realPath = request.getSession().getServletContext().getRealPath("/images/avatar");
                    String realPath = "E:\\graduation project\\last\\src\\main\\resources\\static\\images\\qua";
                    System.out.println("realPath = " + realPath);
                    // 自定义的文件名称

                    // 设置存放图片文件的路径

                    File filePath = new File(realPath,fileName);
                    if (!filePath.getParentFile().exists()){
                        filePath.getParentFile().mkdirs();
                    }
                    System.out.println("存放图片文件的路径:" + realPath);
                    file.transferTo(new File(realPath + File.separator + fileName));
                    System.out.println("文件成功上传到指定目录下"+ realPath + File.separator + fileName);
                    return "http://localhost:8080/images/qua/" + fileName;
                }else {
                    System.out.println("不是我们想要的文件类型,请按要求重新上传");
                    return "error";
                }
            }else {
                System.out.println("文件类型为空");
                return "error";
            }
        }else {
            System.out.println("没有找到相对应的文件");
            return "error";
        }
    }

    @GetMapping("/add")
    public int add(String data){
        System.out.println(data);
//      将JSON Str 转化成JSONObj
        JSONObject eqExpertJson = (JSONObject) JSON.parse(data);
//      make the jsonObj to javaBean
        Eqexpert eqexpert = eqExpertJson.toJavaObject(Eqexpert.class);
        eqexpert.setEqexpertBefor(2);
        eqexpert.setEqexpertLast(2);
        int addStatus = eqexpertServiceImpl.add(eqexpert);
        return addStatus;
    }

    @RequestMapping("one")
    public Object queryById(int id){
        Eqexpert eqexpert = eqexpertServiceImpl.selectById(id);
        return eqexpert;
    }
    @RequestMapping("selector")
    public List<Eqexpert> select(Integer number,String name){
        System.out.println("number = " + number);
        System.out.println("name = " + name);
        return eqexpertServiceImpl.selector(number,name);
    }

}
