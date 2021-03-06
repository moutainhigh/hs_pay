package com.hszsd.webpay.dao;

import com.hszsd.webpay.web.dto.OnlineBankDTO;
import com.hszsd.webpay.po.OnlineBankPO;
import com.hszsd.webpay.condition.OnlineBankCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineBankDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int countByCondition(OnlineBankCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int deleteByCondition(OnlineBankCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int insert(OnlineBankPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int insertSelective(OnlineBankPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    List<OnlineBankDTO> selectByCondition(OnlineBankCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    OnlineBankDTO selectByPrimaryKey(long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int updateByConditionSelective(@Param("record") OnlineBankPO record, @Param("condition") OnlineBankCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int updateByCondition(@Param("record") OnlineBankPO record, @Param("condition") OnlineBankCondition condition);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OnlineBankPO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HSPRD.TB_ONLINE_BANK_034
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OnlineBankPO record);
}