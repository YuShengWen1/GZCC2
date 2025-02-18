package stu.edu.ly.dormitory.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stu.edu.ly.dormitory.manage.entity.StudentEntity;

import java.util.List;

/**
 * 学生存储服务
 **/
@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity, String> {

    /**
     * 按照学生编号查询学生信息
     *
     * @param sn 学生编号
     * @return 学生信息
     */
    StudentEntity findBySn(String sn);

    /**
     * 按照学生姓名查询学生信息
     *
     * @param name 姓名
     * @return 学生信息
     */
    List<StudentEntity> findByName(String name);
}
