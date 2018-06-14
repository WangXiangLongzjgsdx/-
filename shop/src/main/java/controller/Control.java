package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import enity.Category;
import enity.Commodity;
import service.Service;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Controller
public class Control {
    @Autowired
    private Service service;
//  去往登陆界面
    @RequestMapping("tologin")
    public String toLogin(){
        return "login";
    }

    //登陆验证
    @RequestMapping("login")
    public String login(String username , String password, HttpSession session, Model model){
        if(service.login(username,password) != null) {
            session.setAttribute("username", username);
            session.setAttribute("passwd", password);
            return "frame";
        }

        model.addAttribute("msg","账号或密码错误");
        return "message";


    }

    //去往商品种类管理
    @RequestMapping("tocategory")
    public String toCategory(Model model){
        List<Category> categorys = service.queryCategory();
        model.addAttribute("categorys",categorys);
        return "category";
    }

    //到达商品种类修改页面
    @RequestMapping("toupdatecategory")
    public String toUpdateCategory( Model model,Integer id ){
        model.addAttribute("id",id);
        return "updatecategory";
    }

    //修改商品种类
    @RequestMapping("updatecategory")
    public  String updateCategory(Integer id,String number ,String  name , Model model){
        Category category = new Category();
        category.setId(id);
        category.setName(name);
        category.setNumber(number);
        boolean flag = service.updateCategory(category);
        if(flag){
            model.addAttribute("msg","修改成功");
        }else{
            model.addAttribute("msg","修改失败");
        }

        return "message";
    }

    //删除商品种类
    @RequestMapping("deletecategory")
    public String deleteCategory(Integer id , Model model){
       boolean flag =  service.deleteCategory(id);
        if(flag){
            model.addAttribute("msg","删除成功");
        }else{
            model.addAttribute("msg","删除失败");
        }

        return "message";
    }

    //跳转到添加商品种类
    @RequestMapping("toaddcategory")
    public  String  toAddCategory(){
        return "addcategory";
    }


    //添加商品种类
    @RequestMapping("addcategory")
    public String addCategory(String name , String number , Model model){
        Category category = new Category();
        category.setName(name);
        category.setNumber(number);
        boolean flag = service.insertCategory(category);
        if(flag){
            model.addAttribute("msg","添加成功");
        }else{
            model.addAttribute("msg","添加失败");
        }
        return "message";
    }

    //跳转到商品管理页面
    @RequestMapping("tocommodity")
    public  String toCommodity(Model model){
        List<Commodity> commoditys = service.queryCommodity();
        model.addAttribute("commoditys",commoditys);
        return "commodity";
    }

    //跳转到商品修改页面
    @RequestMapping("toupdatecommodity")
    public String toUpdateCommodity(Model model , Integer id){
     List<Category>  cate =   service.queryCategory();
     List<String> categorys = new ArrayList<>();
     for(Category category : cate) {
         categorys.add(category.getName());
     }
     model.addAttribute("id",id);
     model.addAttribute("categorys",categorys);
     return "updatecommodity";


    }


    //修改商品信息
    @RequestMapping("updatecommodity")
    public String updateCommodity(Model model, Integer id , String number , String name , BigDecimal price , Integer repertory , String category){
        Commodity commodity = new Commodity();
        commodity.setId(id);
        commodity.setName(name);
        commodity.setGetegory(category);
        commodity.setPrice(price);
        commodity.setNumber(number);
        commodity.setRepertory(repertory);
        boolean flag = service.updateCommodity(commodity);
        if(flag){
            model.addAttribute("msg","修改成功");
        }else{
            model.addAttribute("msg","修改失败");
        }

        return "message";
    }

    //删除商品
    @RequestMapping("deletecommodity")
    public String deleteCommodity(Integer id , Model model){
        boolean flag = service.deleteCommodity(id);
        if(flag){
            model.addAttribute("msg","删除成功");
        }else{
            model.addAttribute("msg","删除失败");
        }

        return "message";
    }


    //跳转到添加商品页面
    @RequestMapping("toaddcommodity")
    public String toAddCommodity( Model model){
            List<Category>  cate =   service.queryCategory();
            List<String> categorys = new ArrayList<>();
            for(Category category : cate) {
                categorys.add(category.getName());
            }
            model.addAttribute("categorys",categorys);
            return "addcommodity";
    }

    //添加商品
    @RequestMapping("addcommodity")
    public  String addCommodity(Model model,Integer id , String number , String name , String price , Integer repertory , String category ){
        Commodity commodity = new Commodity();
        commodity.setId(id);
        commodity.setName(name);
        commodity.setNumber(number);
        commodity.setPrice(new BigDecimal(price));
        commodity.setGetegory(category);
        commodity.setRepertory(repertory);
        boolean flag = service.insertCommodity(commodity);
        if(flag){
            model.addAttribute("msg","添加成功");
        }else{
            model.addAttribute("msg","添加失败");
        }

        return "message";
    }


    //退出商城
    @RequestMapping("signout")
    public  String signOut(HttpSession session){
        session.invalidate();
        return "login";
    }

    //导入头部图片
    @RequestMapping("tohead")
    public String toHead(){
        return "head";
    }

    //导入商城图片
    @RequestMapping("tobody")
    public String toBody(){
        return "body";
    }

}
