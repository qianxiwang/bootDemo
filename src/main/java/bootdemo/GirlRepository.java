package bootdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{

    //通过年龄查询
    public List<Girl> findByAge(Integer age);

}
