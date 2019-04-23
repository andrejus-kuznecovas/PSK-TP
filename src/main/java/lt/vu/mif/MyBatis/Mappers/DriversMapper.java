package lt.vu.mif.MyBatis.Mappers;

import java.util.List;
import lt.vu.mif.MyBatis.ViewModels.Drivers;
import org.mybatis.cdi.Mapper;

@Mapper
public interface DriversMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DRIVERS
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DRIVERS
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    int insert(Drivers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DRIVERS
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    Drivers selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DRIVERS
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    List<Drivers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.DRIVERS
     *
     * @mbg.generated Wed Apr 18 13:58:42 EEST 2019
     */
    int updateByPrimaryKey(Drivers record);
}