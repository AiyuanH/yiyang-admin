package com.yiyang.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 屈博
 * @email qubome@aliyun.com
 * @Date 2024/9/27 11:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {
    // 总记录数
    private Long total;
    // 当前页面需要展示的数据
    private T data;
}
