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
 *
 * No, you are not creating the instance of your abstract class here.
 * Rather you are creating an instance of an anonymous subclass of your abstract class.
 * And then you are invoking the method on your abstract class reference pointing to subclass object.
 * https://stackoverflow.com/questions/13670991/can-we-instantiate-an-abstract-class
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
