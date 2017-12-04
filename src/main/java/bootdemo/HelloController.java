package bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/12/4.
 */
@RestController
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private int age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private girlProperties girlProperties;

//    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id){
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required =  false ,defaultValue = "0") Integer myid){
        return "id:" + myid;
//        return girlProperties.getCupSize();
    }



}
