package com.clark.daxian.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 基础实体
 * @author 大仙
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 8316892901228306882L;
    /**
     * 主键Id
     */
    protected Long id;

    /**
     * 数据创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime createDate = LocalDateTime.now();
}
