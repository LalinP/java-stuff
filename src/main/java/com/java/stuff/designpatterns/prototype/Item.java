package com.java.stuff.designpatterns.prototype;

/**
 * An abstract class is a class that is declared abstract
 * It may or may not include abstract methods.
 * Abstract classes cannot be instantiated,
 *
 * Fun fact: but they can be subclassed.
 * When an abstract class is subclassed,
 * the subclass usually provides implementations for all of the abstract methods in its parent class.
 *
 * However,
 * if it does not, then the subclass must also be declared abstract.
 */
public abstract class Item implements Cloneable {

  private String title;
  private double price;
  private String url;

  @Override
  protected Object clone()throws CloneNotSupportedException {
    return super.clone();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
