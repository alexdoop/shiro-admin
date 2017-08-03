package com.vacomall.mapper;

import java.util.List;
import java.util.Map;

import com.vacomall.entity.SysMenu;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  * 菜单表 Mapper 接口
 * </p>
 *
 * @author GaoJun.Zhou
 * @since 2017-06-30
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

	List<Map<String, Object>> selectMenuByUid(@Param("uid") String uid, @Param("pid") String pid);

	List<String> selectResourceByUid(@Param("uid") String uid);
	
}