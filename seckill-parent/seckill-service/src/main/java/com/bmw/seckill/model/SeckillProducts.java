package com.bmw.seckill.model;

import java.util.Date;


/**
 * 
 * 商品表
 * 
 **/
public class SeckillProducts{


  /**主键**/

  private Long id;


  /**商品名称**/

  private String name;


  /**商品总库存数量**/

  private Integer count;


  /**已售数量**/

  private Integer saled;


  /**创建时间**/

  private Date createTime;


  /**是否删除：0否 1是**/

  private Integer isDeleted;


  /****/

  private Date startBuyTime;


  /****/

  private Date updatedTime;


  /****/

  private String productDesc;


  /****/

  private Integer status;


  /****/

  private String memo;


  /**唯一标识key**/

  private String productPeriodKey;




  public void setId(Long id) { 
  }


  public Long getId() { 
  }


  public void setName(String name) { 
  }


  public String getName() { 
  }


  public void setCount(Integer count) { 
  }


  public Integer getCount() { 
  }


  public void setSaled(Integer saled) { 
  }


  public Integer getSaled() { 
  }


  public void setCreateTime(Date createTime) { 
  }


  public Date getCreateTime() { 
  }


  public void setIsDeleted(Integer isDeleted) { 
  }


  public Integer getIsDeleted() { 
  }


  public void setStartBuyTime(Date startBuyTime) { 
  }


  public Date getStartBuyTime() { 
  }


  public void setUpdatedTime(Date updatedTime) { 
  }


  public Date getUpdatedTime() { 
  }


  public void setProductDesc(String productDesc) { 
  }


  public String getProductDesc() { 
  }


  public void setStatus(Integer status) { 
  }


  public Integer getStatus() { 
  }


  public void setMemo(String memo) { 
  }


  public String getMemo() { 
  }


  public void setProductPeriodKey(String productPeriodKey) { 
  }


  public String getProductPeriodKey() { 
  }

}