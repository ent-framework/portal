package com.liferay.alloy.tools.model;









public abstract class BaseModel
  implements Comparable
{
  private String _name;
  







  public int compareTo(Object o)
  {
    BaseModel model = (BaseModel)o;
    
    return this._name.compareTo(model.getName());
  }
  
  public boolean equals(Object o) {
    BaseModel model = (BaseModel)o;
    
    return this._name.equals(model.getName());
  }
  
  public String getName() {
    return this._name;
  }
  
  public int hashCode() {
    return this._name.hashCode();
  }
  
  public void setName(String name)
  {
    this._name = name;
  }
}
