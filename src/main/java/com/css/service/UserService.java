package com.css.service;

import com.css.model.MyResult;
import com.css.model.User;

/**
 *
 * @project 网络发票管理系统项目
 * @package com.css.service
 * @file UserService 创建时间:2019/7/16 15:34
 * @title 标题（要求能简洁地表达出类的功能和职责）
 * @description 描述（简要描述类的职责、实现方式、使用注意事项等）
 * @copyright Copyright (c) 2019 中国软件与技术服务股份有限公司
 * @company 中国软件与技术服务股份有限公司
 * @module 模块: 模块名称
 * @author 作者
 * @reviewer 审核人
 *
 * @version 1.0
 * @history 修订历史（历次修订内容、修订人、修订时间等）
 *
 */
public interface UserService {
  MyResult login(User user);
}
