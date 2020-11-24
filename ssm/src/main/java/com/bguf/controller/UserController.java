package com.bguf.controller;

import com.bguf.entity.Log;
import com.bguf.entity.Tax;
import com.bguf.entity.TaxVO;
import com.bguf.entity.User;
import com.bguf.service.UserService;
import com.bguf.utils.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author
 * @Description
 * @Date 3:52 下午 2020/11/18
 */
@Controller
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("/tologin")
    public String toLogin()
    {
        return "login";
    }

    @RequestMapping("/toAdd")
    public String toAdd()
    {
        return "add";
    }

    @RequestMapping("/login")
    @ResponseBody
    public boolean login(User user,
                         HttpSession session)
    {
        if (userService.login(user) != null)
        {
            int uid = userService.login(user);
            user.setId(uid);
            session.setAttribute("user", user);
            return true;
        }
        else
        {
            return false;
        }
    }

    @RequestMapping("/add")
    public String add(MultipartFile _multipartFile, Tax _tax, HttpSession _session)
    {
        if (_multipartFile.isEmpty())
        {
            _tax.setImgurl("");
        }
        else
        {
            String target = _session.getServletContext().getRealPath("/") + "img/";
            String name = FileUploadUtil.uploadFile(_multipartFile, target);
            _tax.setImgurl("img/" + name);
        }
        //新增交税
        //新增日志
        Log log = new Log();
        User user = (User)_session.getAttribute("user");
        log.setUid(user.getId());
        log.setType(user.getName() + "缴纳个人所得税：" + _tax.getMoney() + "人民币");
        userService.addLog(log, _tax);
        return "redirect:list";
    }

    @RequestMapping("/list")
    public ModelAndView list(TaxVO taxVO, HttpSession session)
    {
        User user = (User)session.getAttribute("user");
        taxVO.setUid(user.getId());
        List<Tax> list = userService.query(taxVO);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("taxs", list);
        modelAndView.addObject("tax", taxVO);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    @RequestMapping("/register")
    public String register(User user)
    {
        userService.register(user);
        return "redirect:/tologin";
    }

    @RequestMapping("/loglist")
    public ModelAndView loglist(HttpSession session)
    {
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView = new ModelAndView();
        List<Log> list = userService.loglist(user.getId());
        modelAndView.addObject("logs", list);
        modelAndView.setViewName("loglist");
        return modelAndView;
    }
}
