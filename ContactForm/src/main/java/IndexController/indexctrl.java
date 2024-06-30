package IndexController;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexctrl {

    @RequestMapping("/Index")
    public String Index() {

        return "Index";
    }
@RequestMapping("/Register")
    public String UserRegistration(@ModelAttribute User user){
    System.out.println(user.toString());
    return "Index";
}
}
