package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //无参构造
@AllArgsConstructor //全参构造
public class Item {
	//编号
	private Integer id;
	//名称
	private String name;
	private Integer number;
	//111
}
