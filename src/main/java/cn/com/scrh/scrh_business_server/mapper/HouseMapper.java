package cn.com.scrh.scrh_business_server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.com.scrh.scrh_business_server.model.house.HouseInfoModel;
import cn.com.scrh.scrh_business_server.model.house.HouseInfoModelResp;

/**
 * 房源信息相关操作mapper
 * 
 * @author xiaguanghua
 *
 */
public interface HouseMapper {

	/**
	 * 查找房屋基本信息
	 * 
	 * @param houseInfoModel
	 *            房屋查询基本条件
	 * @return 房屋查询结果
	 */
	@Select({ "<script>", 
			"select h.id, b.pict_url, b.area, b.room_number, b.saloon_number, b.bathroom_number,",
			"h.price,h.address,h.crt_time,h.alter_times",
			"from scrh_basic_house_info as b, scrh_house_publish_info as h", "<where>",
			"h.status=1 and h.city_id=#{cityId, jdbcType=VARCHAR}",
			"<if test='metroId!=null'> and h.metro_id = #{metroId, jdbcType=VARCHAR}</if>",
			"<if test='districtId!=null'> and h.city_district_id = #{districtId, jdbcType=VARCHAR}</if>",
			"<if test='minPrice!=null'> and h.price &gt;= #{minPrice, jdbcType=INTEGER}</if>",
			"<if test='maxPrice!=null'> and h.price &lt;= #{maxPrice, jdbcType=INTEGER}</if>",
			"<if test='fullRent!=null'> and h.full_rent = #{fullRent, jdbcType=INTEGER}</if>",
			"<if test='contenancy!=null'> and h.contenancy = #{contenancy, jdbcType=INTEGER}</if>",
			"<if test='roomNumber!=null'> and b.room_number = #{roomNumber, jdbcType=INTEGER}</if>",
			"<if test='saloonNumber!=null'> and b.saloon_number = #{saloonNumber, jdbcType=INTEGER}</if>",
			"<if test='bathRoomNumber!=null'> and b.bathroom_number = #{bathRoomNumber, jdbcType=INTEGER}</if>",
			"<if test='residencePermit!=null'> and b.residence_permit = #{residencePermit, jdbcType=INTEGER}</if>",

			"</where>", "</script>" })
	List<HouseInfoModelResp> selectNormalHouseInfo(HouseInfoModel houseInfoModel);
}
