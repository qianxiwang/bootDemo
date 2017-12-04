package bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/12/4.
 */
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girl1 = new Girl();
        girl1.setCupSize("A");
        girl1.setAge(18);
        girlRepository.save(girl1);

        Girl gir2 = new Girl();
        gir2.setCupSize("B");
        gir2.setAge(19);

        girlRepository.save(gir2);
    }
}
